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
	
	//! Mapa dos tipos
	private Map<String, String> _types = new HashMap<>();
	private Map<String, Boolean> _is_register = new HashMap<>();
	
	//! Para criação de novas variáveis temporarias sem precisar se preocupar se já existem
	private int _tmp_number = 0;
	private int _label_number = 0;
	private String _current_var = "";
	private String _current_type = "";
	private String _valued_def_type = "";
	private String _return_auxiliar = "";
	
	//! SWITCH
	private String _switch_tmp = "";
	private String _switch_comp = "";
	private String _switch_final_label = "";

	@Override
	public String visitProgram_def(FreedomLessLessParser.Program_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitClass_def(FreedomLessLessParser.Class_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitClass_members_def(FreedomLessLessParser.Class_members_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitPublic_def(FreedomLessLessParser.Public_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitPrivate_def(FreedomLessLessParser.Private_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitAttribute_def(FreedomLessLessParser.Attribute_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String type = ctx.type_def().accept(this);
		_current_type = type;
		
		Vector<String> vars = new Vector<String>(ctx.ID().size());
		
		String code = "";
		
		//! Reserva espaço na pilha
		//! Constrói o valor dos atributos
		if (ctx._f_scope.equals("null"))
		{
			for (int i = 0; i < ctx.ID().size(); i++)
			{
				String id = "@" + ctx.ID(i).getText();
				
				vars.add(id);
				
				_types.put(id, type);
				_is_register.put(id, false);
				
				code += id + " = global " + type + " ";
				
				if (ctx.valued_expression_def(i) != null) {
					ctx.valued_expression_def(i).accept(this);
					code += _current_var + "\n";
				} else {
					code += "0\n";
				}
			}
		}
		else
		{
			for (int i = 0; i < ctx.ID().size(); i++)
			{
				String id = "%" + ctx.ID(i).getText();
				
				vars.add(id);
				
				_types.put(id, type);
				_is_register.put(id, false);
				
				code += id + " = alloca " + type + "\n";
				
				if (ctx.valued_expression_def(i) != null)
				{
					String construct_tmps = ctx.valued_expression_def(i).accept(this);
					code += construct_tmps + "store " + _types.get(vars.get(i)) + " " + _current_var + ", " + _types.get(vars.get(i)) + "* " + vars.get(i) + "\n";
				}
			}
		}

		return code;
	}
	
	@Override
	public String visitValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String var = "";
		String code = "";
		
		//! value_def operation |
		if (ctx.value_def() != null) {
			var = ctx.value_def().accept(this);
			_types.put(var, _valued_def_type);
			_current_type = _valued_def_type;
		}
		
		//! ID (((ASSIGN | auto_assign_op) valued_expression_def) | auto_increm_op | OPEN_BRAK INT CLOSE_BRAK )? operation ;
		else if (ctx.ID() != null) {

			String id = ctx.ID().getText();
			if (_types.containsKey("@"+id))
				id = "@" + id;
			else
				id = "%" + id;

			boolean local = _is_register.containsKey(id) && _is_register.get(id);
			
			if (!local) {
				var = "%tmp" + _tmp_number++;
				_is_register.put(var, true);
					
				code = var + " = load ";
					
				code += _types.get(id) + ", " + _types.get(id) + "* " + id;
				_types.put(var, _types.get(id));
					
				code += "\n";
			}
			else
				var = id;
			
			_types.put(var, _types.get(id));
			_current_var = var;
			_current_type = _types.get(id);
		}
		
		else if (ctx.function_call_def() != null) {
			code += ctx.function_call_def().accept(this);
			var = _current_var;
		}
		
		String ret = "";
		
		if (ctx.operation() != null) {
			ret = ctx.operation().accept(this);
		}
		
		if (ctx.valued_expression_def() != null && ctx.ID() != null) {
			ret = ctx.valued_expression_def().accept(this);
			
			
			String id = "%" + ctx.ID().getText();
			boolean local = _is_register.containsKey(id) && _is_register.get(id);
			
			if (!local)
				ret += "store " + _types.get(id) + " " + _current_var + ", " + _types.get(id) + "* " + id + "\n";
		}
		
		if (ret.equals("")) {
			_current_var = var;
			return code;
		}
		
		_current_var = "%tmp" + _tmp_number++;
		_types.put(_current_var, _current_type);
		_is_register.put(_current_var, true);
		
		ret = ret.replaceAll("_LHS_", _current_var);
		ret = ret.replaceAll("_VAR1_", var);
		ret = ret.replaceAll("_TYPE_", _types.get(var));
		
		return code + ret;
	}

	@Override
	public String visitOperation(FreedomLessLessParser.OperationContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());

		String code = "";
		String actual_var = _current_var;
		String actual_type = _current_type;

		if (ctx.logical_op(0) != null)
		{
			String op = ctx.logical_op(0).accept(this);

			if (op.contains("and"))
			{

			} else if (op.contains("or")){


			} else {
				String rhs = ctx.valued_expression_def(0).accept(this);
				
				op = op.replaceAll("_TYPE_", actual_type);
				op = op.replaceAll("_VAR1_", actual_var);
				op = op.replaceAll("_VAR2_", _current_var);

				return rhs + op;
			}

		}
		
		if (ctx.arithmetic_op(0) != null) {
			String op = ctx.arithmetic_op(0).accept(this);
			String rhs = ctx.valued_expression_def(0).accept(this);
			
			_current_type = _types.get(_current_var);
			op = rhs + op.replaceAll("_VAR2_", _current_var);

			return op;
		}
		
		return code;
	}

	@Override
	public String visitFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "";
		
		if (ctx.ID(0) != null) {
			String args = ctx.argument_def(0).accept(this);
			code += _return_auxiliar;
			_return_auxiliar = "";
			
			String id = "@" + ctx.ID(0).getText();
			
			if (_types.get(id).equals("void")) {
				code += "call void " + id + "(";
				code += args + ")\n";
			} else {
				_current_var = "%tmp" + _tmp_number++;
				_types.put(_current_var, _current_type);
				
				code += _current_var + " = call " + _types.get(id) + " " + id + "(";
				code += args + ")\n";
			}
		}

		return code;
	}

	@Override
	public String visitArgument_def(FreedomLessLessParser.Argument_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String args = "";
		int size = ctx.valued_expression_def().size();
		
		for (int i = 0; i < size - 1; i++) {
			_return_auxiliar += ctx.valued_expression_def(i).accept(this);
			args += _current_type + " " + _current_var + ", ";
		}
		
		_return_auxiliar += ctx.valued_expression_def(size-1).accept(this);
		args += _current_type + " " + _current_var;
		
		return args;
	}

	@Override
	public String visitFunction_def(FreedomLessLessParser.Function_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String name = "@" + ctx.ID().getText();
		
		if (name.equals("@print")) {
			_types.put(name, "void");
			return "@.pstr = private unnamed_addr constant [4 x i8] c\"%u\\0A\\00\"\n" +
					"declare i32 @printf(i8*, ...)\n" +
					"define void @print(i32 %i) {\n" +
				    "  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.pstr, i32 0, i32 0), i32 %i)\n" +
				    "  ret void\n" +
					"}\n";
		}
		
		String type = ctx.type_def().accept(this);
		
		String param = "";
		if (ctx.param_def() != null)
			param = ctx.param_def().accept(this);
		
		String block = ctx.block_def().accept(this);
		
		System.out.println("t=" + type);
		System.out.println("n=" + name);
		System.out.println("p=" + param);
		System.out.println("b=" + block);
		
		//! Code
		
		_types.put(name, type);
		
		String code = "\ndefine " + type + " " + name + "(" + param + ") {\n";
		code += "entry:\n";
		code += block;
		code += "}\n\n";
		
		return code;
	}

	@Override
	public String visitParam_def(FreedomLessLessParser.Param_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String type = ctx.type_def().accept(this);
		String name = "%" + ctx.ID().getText();
		
		_types.put(name, type);
		_is_register.put(name, true);
		
		String code = type + " " + name;
		
		if (ctx.param_def(0) != null)
			code += ", " + ctx.param_def(0).accept(this);
		
		return code;
	}

	@Override
	public String visitBlock_def(FreedomLessLessParser.Block_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = visitChildren(ctx);
		
		return code;
	}

	@Override
	public String visitValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "";
		
		//! RETURN valued_expression_def |
		if (ctx.RETURN() != null)
			code = ctx.valued_expression_def().accept(this) + "ret " + _types.get(_current_var) + " " + _current_var;
		
		//! attribute_def |
		else if (ctx.attribute_def() != null) {
			code = ctx.attribute_def().accept(this);
		}
		
		//! ID ((ASSIGN | ainda nao auto_assign_op) valued_expression_def | ainda nao auto_increm_op) ;
		else if (ctx.ID() != null) {
			String id = "%" + ctx.ID().getText();
			
			code = ctx.valued_expression_def().accept(this);
			
			code += "store " + _types.get(id) + " " + _current_var + ", " + _types.get(id) + "* " + id;
		}
		
		else if (ctx.function_call_def() != null) {
			code += ctx.function_call_def().accept(this);
		}
		
		return code + "\n";
	}

	@Override
	public String visitStruct_def(FreedomLessLessParser.Struct_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitIf_def(FreedomLessLessParser.If_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "";
		
		//! Expression logic
		code += ctx.valued_expression_def().accept(this);
		
		//! IF LOGIC
		
		String cond = "%tmp" + _tmp_number++;
		_types.put(cond, "i1");
		String labelFalse = "label" + _label_number++;
		String labelTrue = "label" + _label_number++;
		String labelAfter = "label" + _label_number++;
		
		code += cond + " = icmp eq i1 " + _current_var + ", 0\n"; //! equal zero?
		code += "br i1 " + cond + ", label %" + labelFalse + ", label %" + labelTrue + "\n";
		
		//! True
		code += labelTrue + ":\n\n";
		code += ctx.block_def(0).accept(this);
		code += "br label %" + labelAfter + "\n";
		
		//! False
		code += labelFalse + ":\n\n";
		if (ctx.block_def(1) != null) {
			code += ctx.block_def(1).accept(this);
		} else {
			
		}
		code += "br label %" + labelAfter + "\n";
		
		//! Jump para depois dos ifs
		code += labelAfter + ":\n\n";
		
		
		return code;
	}

	@Override
	public String visitFor_def(FreedomLessLessParser.For_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		//! Define for(ISSO; ...; ...)
		String def = ctx.valued_attribute_def(0).accept(this);
		
		//! Block
		String block = ctx.block_def().accept(this);
		
		//! Define for(...; ...; ISSO)
		String inc = ctx.valued_expression_def(1).accept(this);

		//! Define for(...; ISSO; ...)
		String condition = ctx.valued_expression_def(0).accept(this);
		String tmp_cond = _current_var;
		_types.put(tmp_cond, "i1");
		
		//! CODE

		//! Header
		String code = def;
		
		String labelCond = "label" + _label_number++;
		String labelLoop = "label" + _label_number++;
		String labelEndLoop = "label" + _label_number++;
		
		code += "br label %" + labelCond + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		
		//! Body
		code += labelCond + ":\n\n";
		//! Check condition
		code += condition;
		code += "br i1 " + tmp_cond + ", label %" + labelLoop + ", label %" + labelEndLoop + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		
		code += labelLoop + ":\n\n";
		code += block;
		code += inc;
		
		code += "br label %" + labelCond + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		
		code += labelEndLoop + ":\n\n";
		
		return code;
	}

	@Override
	public String visitValued_attribute_def(FreedomLessLessParser.Valued_attribute_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String type = ctx.type_def().accept(this);
		_current_type = type;
		
		String code = "";
		
		//! Reserva espaço na pilha
		String id = "%" + ctx.ID().getText();
		_types.put(id, type);
		_is_register.put(id, false);
		code += id + " = alloca " + type + "\n";
		
		//! Constrói o valor dos atributos
		String construct_tmps = "";
			
		construct_tmps += ctx.valued_expression_def().accept(this);
		code += construct_tmps + "store " + _types.get(id) + " " + _current_var + ", " + _types.get(id) + "* " + id;
		
		return code + "\n";
	}

	@Override
	public String visitWhile_def(FreedomLessLessParser.While_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		//! Block
		String block = ctx.block_def().accept(this);

		//! Condition
		String condition = ctx.valued_expression_def().accept(this);
		
		//! Condition Var
		String temp_cond = _current_var;
		
		String labelCond = "label" + _label_number++;
		String labelLoop = "label" + _label_number++;
		String labelEnd = "label" + _label_number++;
		String ret = "ret i32 0";

		String code = 	"br label %" + labelCond + "\n\n" +
						ret + "\n" +
						labelCond + ":\n\n" +
						condition + "\n" +
						"br i1 " + temp_cond + ", label %" + labelLoop + ", label %" + labelEnd + "\n\n" +
						ret + "\n" +
						labelLoop + ":\n\n" +
						block + "\n" +
						"br label %" + labelCond + "\n\n" +
						ret + "\n" +
						labelEnd + ":\n\n";

		return code;
	}

	@Override
	public String visitSwitch_def(FreedomLessLessParser.Switch_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		_switch_tmp = "";
		_switch_final_label = "label" + _label_number++;
		String code = visitChildren(ctx); 
		
		_switch_tmp = "";
		
		code += "br label %" + _switch_final_label + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		code += _switch_final_label + ":\n\n";
		
		
		return code;
	}

	@Override
	public String visitSwitch_case_def(FreedomLessLessParser.Switch_case_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		boolean first_case = _switch_tmp.equals("");
		
		if (first_case)
			_switch_tmp = _current_var;
		
		//! Compare
		String cond = "%tmp" + _tmp_number++;
		_types.put(cond, "i1");
		
		String labelCase = "label" + _label_number++;
		String labelTrue = "label" + _label_number++;
		String labelNext = "label" + _label_number;
		
		String switch_tmp_aux = _switch_tmp;
		
		String code_child = visitChildren(ctx);
		
		_switch_tmp = switch_tmp_aux;
		
		String code = "";
		
		if (!first_case)
			code += labelCase + ":\n\n";
		
		code += cond + " = icmp eq " + _types.get(_switch_tmp) + " " + _switch_tmp + ", " + _switch_comp + "\n";
		
		code += "br i1 " + cond + ", label %" + labelTrue + ", label %" + labelNext + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		
		code += labelTrue + ":\n\n";
		code += code_child;
		code += "br label %" + _switch_final_label + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		
		return code;
	}

	@Override
	public String visitSwitch_default_def(FreedomLessLessParser.Switch_default_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		_switch_tmp = "";
		
		String code_child = visitChildren(ctx);

		String labelDefault = "label" + _label_number++;
		
		String code = labelDefault + ":\n\n";
		code += code_child;
		code += "br label %" + _switch_final_label + "\n";
		code += "ret i32 0\n"; //! apenas para criar a separação do codigo e assim podendo usar label
		
		return code;
	}

	@Override
	public String visitMain_def(FreedomLessLessParser.Main_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String main = "\ndefine i32 @main() {\n";
		main += "entry:\n\n";
		
		String ret = ctx.block_def().accept(this);
		
		return main + ret + "}";
	}

	@Override
	public String visitType_def(FreedomLessLessParser.Type_defContext ctx)
	{
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
			return ""; //! Not implemented
		
		return "";
	}
	
	@Override
	public String visitValue_def(FreedomLessLessParser.Value_defContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		_valued_def_type = "";
		
		if (ctx.INT() != null) {
			_valued_def_type = "i32";
			
			if (_switch_tmp.equals(""))
				return ctx.INT().getText();
			
			_switch_comp = ctx.INT().getText();
		}
		
		if (ctx.INTEGER() != null) {
			_valued_def_type = "i32";
			
			if (_switch_tmp.equals(""))
				return ctx.INTEGER().getText();
			
			_switch_comp = ctx.INTEGER().getText();
		}
		
		if (ctx.FLOATING() != null) {
			_valued_def_type = "double";
			
			if (_switch_tmp.equals(""))
				return ctx.FLOATING().getText();
			
			_switch_comp = ctx.FLOATING().getText();
		}
		
		if (ctx.BOOLEAN() != null) {
			_valued_def_type = "i1";
			
			if (ctx.FLOATING().getText().equals("true")) {
				if (_switch_tmp.equals(""))
					return "1";

				_switch_comp = "1";
				
			} else {
				if (_switch_tmp.equals(""))
					return "0";

				_switch_comp = "0";
			}
		}
		
		if (ctx.CHAR() != null) {
			_valued_def_type = "i8";
			
			if (_switch_tmp.equals(""))
				return ctx.CHAR().getText();
			
			_switch_comp = ctx.CHAR().getText();
		}
		
		_switch_tmp = "";
		return "";
	}

	@Override
	public String visitLogical_op(FreedomLessLessParser.Logical_opContext ctx)
	{
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
			String tmp = "%tmp" + _tmp_number++;
			_types.put(tmp, _current_type);
			code = tmp + " = and " + " _TYPE_ _VAR1_, _VAR2_\n";
			code += "_LHS_ = " + "icmp ne i1 " + tmp + ", 0\n";
			
//			_current_type = "i1";
			return code;
		}

		if (ctx.OR() != null) {
			String tmp = "%tmp" + _tmp_number++;
			_types.put(tmp, _current_type);
			code = tmp + " = or " + " _TYPE_ _VAR1_, _VAR2_\n";
			code += "_LHS_ = " + "icmp ne i1 " + tmp + ", 0\n";
			
			return code;
		}
		
//		_current_type = "i1";
		return code + "_TYPE_ _VAR1_, _VAR2_\n";
	}
	
	@Override
	public String visitArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx)
	{
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
		
		_current_type = _types.get(_current_var);
		return code + "_TYPE_ _VAR1_, _VAR2_\n";
	}

	@Override
	public String visitAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx)
	{
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

	@Override
	public String visitAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx)
	{
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		return visitChildren(ctx);
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult)
	{
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return "" + aggregate + nextResult;
	}
}