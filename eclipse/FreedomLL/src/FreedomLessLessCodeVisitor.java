// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
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
	
	public String _code = "";

	@Override public String visitProgram_def(FreedomLessLessParser.Program_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitClass_def(FreedomLessLessParser.Class_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitClass_members_def(FreedomLessLessParser.Class_members_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitPublic_def(FreedomLessLessParser.Public_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitPrivate_def(FreedomLessLessParser.Private_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitAttribute_def(FreedomLessLessParser.Attribute_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String type = ctx.type_def().accept(this);
		String defs = "";
		
		for (int i = 0; i < ctx.ID().size(); i++) {
			defs += "%" + ctx.ID(i).getText() + " = " + type + " ";
			
			if (ctx.valued_expression_def(0) != null) {
				defs += ctx.valued_expression_def(i).accept(this) + "\n";
			} else {
				defs += "0\n";
			}
		}
		
		System.out.println("\n\n" + defs);
		
		_code += defs;
		
		return "";
	}
	
	private int temp_number = 0;

	@Override public String visitValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String var = "";
		
		//! tem as outras coisas
		if (ctx.value_def() != null) {
			var = ctx.value_def().accept(this);
		}
 
		String ret_op = ctx.operation().accept(this);
		
		if (ret_op.equals(""))
			return var;
		
		return ret_op.replaceAll("__REPLACE__", var);
	}

	@Override public String visitOperation(FreedomLessLessParser.OperationContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		if (ctx.logical_op(0) != null) {
			String var = ctx.valued_expression_def(0).accept(this);
			
			if (ctx.logical_op(0).LESS() != null)
				return "";
			
		}
		
		if (ctx.arithmetic_op(0) != null) {
			String var = ctx.valued_expression_def(0).accept(this);
			
			if (ctx.arithmetic_op(0).PLUS() != null)
				return "add __REPLACE__, " + ;
			
			if (ctx.arithmetic_op(0).MINUS() != null)
				return "add __REPLACE__, " + ;
			
			if (ctx.arithmetic_op(0).MULT() != null)
				return "mult __REPLACE__, " + ;
			
			if (ctx.arithmetic_op(0).DIV() != null)
				return "div __REPLACE__, " + ;
		}
		
		return "";
	}

	@Override public String visitFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitArgument_def(FreedomLessLessParser.Argument_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitFunction_def(FreedomLessLessParser.Function_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitParam_def(FreedomLessLessParser.Param_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitBlock_def(FreedomLessLessParser.Block_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String ret = visitChildren(ctx);
		
		return ret;
	}

	@Override public String visitValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx) {
		System.out.println(ctx.getClass().getName() + " - "  + ctx.getText());
		
		String code = "";
		
		if (ctx.RETURN() != null) {
			code = "ret ";
			code += visitChildren(ctx);
		}
		
		if (ctx.attribute_def() != null) {
			code += visitChildren(ctx);
		}
		
		return code;
	}

	@Override public String visitStruct_def(FreedomLessLessParser.Struct_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitIf_def(FreedomLessLessParser.If_defContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

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
		
		String main = "define i32 @main() {\n\t";
		
		String ret = visitChildren(ctx);
		
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
			return "int " + ctx.INT().getText();
		}
		
		if (ctx.INTEGER() != null) {
			return "integer " + ctx.INTEGER().getText();
		}
		
		return "test";
	}

	@Override public String visitLogical_op(FreedomLessLessParser.Logical_opContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }

	@Override public String visitAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx) { System.out.println(ctx.getClass().getName() + " - "  + ctx.getText()); return visitChildren(ctx); }
}