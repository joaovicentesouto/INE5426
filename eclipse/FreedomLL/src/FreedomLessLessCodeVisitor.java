// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.ArrayList;

/**
 * This class provides an empty implementation of {@link FreedomLessLessVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <String> The System.out.println(ctx.getClass().getName()); return type of the visit operation. Use {@link Void} for
 * operations with no System.out.println(ctx.getClass().getName()); return type.
 */
public class FreedomLessLessCodeVisitor extends AbstractParseTreeVisitor<String> implements FreedomLessLessVisitor<String> {
		
	@Override public String visitProgram_def(FreedomLessLessParser.Program_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitClass_def(FreedomLessLessParser.Class_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }
 
	@Override public String visitClass_members_def(FreedomLessLessParser.Class_members_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitPublic_def(FreedomLessLessParser.Public_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitPrivate_def(FreedomLessLessParser.Private_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitAttribute_def(FreedomLessLessParser.Attribute_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx) {
		System.out.println(ctx.getClass().getName());
		
		
		
		return visitChildren(ctx);
	}

	@Override public String visitOperation(FreedomLessLessParser.OperationContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitArgument_def(FreedomLessLessParser.Argument_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitFunction_def(FreedomLessLessParser.Function_defContext ctx) { 
		String r = "define";
		for (SymbolEntry s : FreedomLessLessParser._symbolTable) {
			if(s.id.equals(ctx.name())) {
				switch(s.features.get(0)){
				case "void":
					r += "void @" + ctx.name() + "(" + visitChildren(ctx) + ") {" + visitChildren(ctx) + "}";
					break;
				case "int":
					r += "i32 @" + ctx.name() + "(" + visitChildren(ctx) + ") {" + visitChildren(ctx) + "}";
					break;
				case "double":
					r += "i64 @" + ctx.name() + "(" + visitChildren(ctx) + ") {" + visitChildren(ctx) + "}";
					break;
				case "char":
					r += "char? @" + ctx.name() + "(" + visitChildren(ctx) + ") {" + visitChildren(ctx) + "}" ;
					break;
				case "bool":
					r += "bool? @" + ctx.name() + "(" + visitChildren(ctx) + ") {" + visitChildren(ctx) + "}" ;
					break;
				default:
					return "";
					
				}
			}
		}
		System.out.println(ctx.getClass().getName()); 
		return r; 
	}

	@Override public String visitParam_def(FreedomLessLessParser.Param_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitBlock_def(FreedomLessLessParser.Block_defContext ctx) {
		System.out.println(ctx.getClass().getName());
		
		String ret = visitChildren(ctx);
		
		return ret;
	}

	@Override public String visitValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx) {
		System.out.println(ctx.getClass().getName());
		
		String code = "";
		
		if (ctx.RETURN() != null) {
			code = "ret ";
			code += visitChildren(ctx);
		}
		
		return "";
	}

	@Override public String visitStruct_def(FreedomLessLessParser.Struct_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitIf_def(FreedomLessLessParser.If_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitFor_def(FreedomLessLessParser.For_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitValued_attribute_def(FreedomLessLessParser.Valued_attribute_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitWhile_def(FreedomLessLessParser.While_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitSwitch_def(FreedomLessLessParser.Switch_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitSwitch_case_def(FreedomLessLessParser.Switch_case_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitSwitch_default_def(FreedomLessLessParser.Switch_default_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitMain_def(FreedomLessLessParser.Main_defContext ctx) {
		System.out.println(ctx.getClass().getName());
		
		String main = "define i32 @main() {\n\t";
		
		String ret = visitChildren(ctx);
		
		return main + ret + "\n}";
	}

	@Override public String visitType_def(FreedomLessLessParser.Type_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitValue_def(FreedomLessLessParser.Value_defContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitLogical_op(FreedomLessLessParser.Logical_opContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }

	@Override public String visitAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx) { System.out.println(ctx.getClass().getName()); return visitChildren(ctx); }
}