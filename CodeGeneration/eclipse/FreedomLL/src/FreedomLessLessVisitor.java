// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FreedomLessLessParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FreedomLessLessVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#program_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_def(FreedomLessLessParser.Program_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(FreedomLessLessParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#class_members_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_members_def(FreedomLessLessParser.Class_members_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#public_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic_def(FreedomLessLessParser.Public_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#private_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_def(FreedomLessLessParser.Private_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#class_scope_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#attribute_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_def(FreedomLessLessParser.Attribute_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#valued_expression_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(FreedomLessLessParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#function_call_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#argument_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_def(FreedomLessLessParser.Argument_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(FreedomLessLessParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#param_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_def(FreedomLessLessParser.Param_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#block_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_def(FreedomLessLessParser.Block_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#valueless_expression_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#struct_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_def(FreedomLessLessParser.Struct_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#if_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_def(FreedomLessLessParser.If_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#for_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_def(FreedomLessLessParser.For_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#valued_attribute_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValued_attribute_def(FreedomLessLessParser.Valued_attribute_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#while_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_def(FreedomLessLessParser.While_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#switch_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_def(FreedomLessLessParser.Switch_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#switch_case_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case_def(FreedomLessLessParser.Switch_case_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#switch_default_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_default_def(FreedomLessLessParser.Switch_default_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#main_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_def(FreedomLessLessParser.Main_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(FreedomLessLessParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#value_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_def(FreedomLessLessParser.Value_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(FreedomLessLessParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#arithmetic_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#auto_assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreedomLessLessParser#auto_increm_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx);
}