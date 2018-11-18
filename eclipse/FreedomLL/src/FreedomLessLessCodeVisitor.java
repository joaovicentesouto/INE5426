// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link FreedomLessLessVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <String> The System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return type of the visit operation. Use {@link Void} for
 * operations with no System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return type.
 */
public class FreedomLessLessCodeVisitor extends AbstractParseTreeVisitor<String> implements FreedomLessLessVisitor<String> {
	
//	public String _code = "";
	
	//! Mapa dos tipos
	private Map<String, String> _types = new HashMap<>();
	
	//! Para criação de novas variáveis temporarias sem precisar se preocupar se já existem
	private int _tmp_number = 0;
	private int _label_number = 0;
	private String _current_tmp = "";
	private String _current_type = "";
	private String _valued_def_type = "";

	@Override public String visitProgram_def(FreedomLessLessParser.Program_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitClass_def(FreedomLessLessParser.Class_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitClass_members_def(FreedomLessLessParser.Class_members_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitPublic_def(FreedomLessLessParser.Public_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitPrivate_def(FreedomLessLessParser.Private_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitAttribute_def(FreedomLessLessParser.Attribute_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String type = ctx.type_def().accept(this);
		_current_type = type;
		
		//! Global
		if (ctx._f_scope.equals("null")) {
//			return;
		}
		
		String code = "";
		
		Vector<String> vars = new Vector<String>(ctx.ID().size());
		
		//! Reserva espaço na pilha
		for (int i = 0; i < ctx.ID().size(); i++) {
			vars.add("%" + ctx.ID(i).getText());
			_types.put("%" + ctx.ID(i).getText(), type);
			code += "%" + ctx.ID(i).getText() + " = alloca " + type + "\n";
		}
		
		//! Constrói o valor dos atributos
		for (int i = 0; i < ctx.ID().size(); i++) {
			String construct_tmps = "";
			
			if (ctx.valued_expression_def(i) != null) {
				construct_tmps += ctx.valued_expression_def(i).accept(this);
				
				code += construct_tmps + "store " + _types.get(vars.get(i)) + " " + _current_tmp + ", " + _types.get(vars.get(i)) + "* " + vars.get(i) + "\n";
			}
		}
		
		return code;
	}
	
	@Override public String visitValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String var = "";
		String code = "";
		
		
		//! value_def operation |
		if (ctx.value_def() != null) {
			var = ctx.value_def().accept(this);
			_types.put(var, _valued_def_type);
			
			if (!_current_type.equals(_valued_def_type))
				System.err.println("Valued_expression_def: incompatible types");
		}
		
		//! ID (((ASSIGN | auto_assign_op) valued_expression_def) | auto_increm_op | OPEN_BRAK INT CLOSE_BRAK )? operation ;
		else if (ctx.ID() != null) {
			var = "%tmp" + _tmp_number++;
			code = var + " = load ";
			String id = "%" + ctx.ID().getText();
			
			code += _types.get(id) + ", " + _types.get(id) + "* " + id;
			_types.put(var, _types.get(id));
			
			code += "\n";
		}
 
		String ret_op = ctx.operation().accept(this);
		
		if (ret_op.equals("")) {
			_current_tmp = var;
			return code;
		}
		
		_current_tmp = "%tmp" + _tmp_number++;
		_types.put(_current_tmp, _current_type);
		
		ret_op = ret_op.replaceAll("_LHS_", _current_tmp);
		ret_op = ret_op.replaceAll("_VAR1_", var);
		
		return code + ret_op;
	}

	@Override public String visitOperation(FreedomLessLessParser.OperationContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		if (ctx.logical_op(0) != null) {
			String op = ctx.logical_op(0).accept(this);
			String rhs = ctx.valued_expression_def(0).accept(this);
			
			_current_type = "i1";
			op = rhs + op.replaceAll("_VAR2_", _current_tmp);
			return op;
		}
		
		if (ctx.arithmetic_op(0) != null) {
			String op = ctx.arithmetic_op(0).accept(this);
			String rhs = ctx.valued_expression_def(0).accept(this);
			
			_current_type = _types.get(_current_tmp);
			op = rhs + op.replaceAll("_VAR2_", _current_tmp);
			return op;
		}
		
		return "";
	}

	@Override public String visitFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitArgument_def(FreedomLessLessParser.Argument_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitFunction_def(FreedomLessLessParser.Function_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitParam_def(FreedomLessLessParser.Param_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitBlock_def(FreedomLessLessParser.Block_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = visitChildren(ctx);
		
		return code;
	}

	@Override public String visitValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "";
		
		//! RETURN valued_expression_def |
		if (ctx.RETURN() != null)
			code = ctx.valued_expression_def().accept(this) + "ret " + _types.get(_current_tmp) + " " + _current_tmp;
		
		//! attribute_def |
		else if (ctx.attribute_def() != null) {
			code = ctx.attribute_def().accept(this);
		}
		
		//! ID ((ASSIGN | ainda nao auto_assign_op) valued_expression_def | ainda nao auto_increm_op) ;
		else if (ctx.ID() != null) {
			String id = "%" + ctx.ID().getText();
			
			code = ctx.valued_expression_def().accept(this);
			
			code += "store " + _types.get(id) + " " + _current_tmp + ", " + _types.get(id) + "* " + id;
		}
		
		return code + "\n";
	}

	@Override public String visitStruct_def(FreedomLessLessParser.Struct_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitIf_def(FreedomLessLessParser.If_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "";
		
		//! Expression logic
		code += ctx.valued_expression_def().accept(this);
		
		//! IF LOGIC
		
		String cond = "%tmp" + _tmp_number++;
		String labelFalse = "label" + _label_number++;
		String labelTrue = "label" + _label_number++;
		String labelAfter = "label" + _label_number++;
		
		code += cond + " = icmp eq " + _types.get(_current_tmp) + " " + _current_tmp + ", 0\n"; //! equal zero?
		code += "br i1 " + cond + ", label %" + labelFalse + ", label %" + labelTrue + "\n";
		
		//! True
		code += labelTrue + ":\n";
		code += ctx.block_def(0).accept(this);
		code += "br label %" + labelAfter + "\n";
		
		//! False
		code += labelFalse + ":\n";
		if (ctx.block_def(1) != null) {
			code += ctx.block_def(1).accept(this);
		} else {
			
		}
		
		//! Jump para depois dos ifs
		code += labelAfter + ":\n";
		
		
		return code;
	}

	@Override public String visitFor_def(FreedomLessLessParser.For_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitValued_attribute_def(FreedomLessLessParser.Valued_attribute_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		
		return visitChildren(ctx);
	}

	@Override public String visitWhile_def(FreedomLessLessParser.While_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitSwitch_def(FreedomLessLessParser.Switch_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitSwitch_case_def(FreedomLessLessParser.Switch_case_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitSwitch_default_def(FreedomLessLessParser.Switch_default_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitMain_def(FreedomLessLessParser.Main_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String main = "define i32 @main() {\n";
		
		String ret = ctx.block_def().accept(this);
		
		return main + ret + "\n}";
	}

	@Override public String visitType_def(FreedomLessLessParser.Type_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		if (ctx.INT_T() != null)
			return "i32";

		if (ctx.DOUBLE_T() != null)
			return "double";

		if (ctx.CHAR_T() != null)
			return "i8";
		
		if (ctx.BOOL_T() != null)
			return "i1";

		if (ctx.CLASS() != null)
			return ""; //! Not implementvou m
		
		return "";
	}
	
	@Override public String visitValue_def(FreedomLessLessParser.Value_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		if (ctx.INT() != null) {
			_valued_def_type = "i32";
			return ctx.INT().getText();
		}
		
		if (ctx.INTEGER() != null) {
			_valued_def_type = "i32";
			return ctx.INTEGER().getText();
		}
		
		if (ctx.FLOATING() != null) {
			_valued_def_type = "double";
			return ctx.FLOATING().getText();
		}
		
		if (ctx.BOOLEAN() != null) {
			_valued_def_type = "i1";
			
			if (ctx.FLOATING().getText().equals("true"))
				return "1";
			else
				return "0";
		}
		
		if (ctx.CHAR() != null) {
			_valued_def_type = "i8";
			
			return ctx.CHAR().getText();
		}
		
		_valued_def_type = "";
		return "";
	}

	@Override public String visitLogical_op(FreedomLessLessParser.Logical_opContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "_LHS_ = ";
		
		if (ctx.LESS() != null)
			code += "icmp slt ";
	
		if (ctx.BIGGER() != null)
			code += "icmp sgt ";
		
		if (ctx.LESS_EQ() != null)
			code += "icmp sle ";

		if (ctx.BIGGER_EQ() != null)
			code += "icmp sge ";

		if (ctx.EQUALS() != null)
			code += "icmp eq ";

		if (ctx.NOT_EQUALS() != null)
			code += "icmp ne ";

		if (ctx.AND() != null) {
			//! Fazer AND e depois EQ 0
			code += "and ";
		}

		if (ctx.OR() != null) {
			//! Fazer OR e depois EQ 0
			code += "or ";
		}
		
		return code + _current_type + " _VAR1_, _VAR2_\n";
	}
	
	@Override public String visitArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "_LHS_ = ";
		
		if (_current_type.equals("double"))
			code += "f";
		
		if (ctx.PLUS() != null)
			code += "add ";

		if (ctx.MINUS() != null)
			code += "sub ";

		if (ctx.MULT() != null)
			code += "mul ";

		if (ctx.DIV() != null) {
			if (_current_type.equals("i32"))
				code += "s";

			code += "div ";
		}
		
		return code + _current_type + " _VAR1_, _VAR2_\n";
	}

	@Override public String visitAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		if (ctx.AUTOPLUS() != null) {
			
		}

		if (ctx.AUTOMINUS() != null) {
			
		}

		if (ctx.AUTOMULT() != null) {
			
		}

		if (ctx.AUTODIV() != null) {
			
		}
		
		return "";
	}

	@Override public String visitAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return "" + aggregate + nextResult;
	}
}