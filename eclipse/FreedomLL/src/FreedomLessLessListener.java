// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FreedomLessLessParser}.
 */
public interface FreedomLessLessListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#program_def}.
	 * @param ctx the parse tree
	 */
	void enterProgram_def(FreedomLessLessParser.Program_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#program_def}.
	 * @param ctx the parse tree
	 */
	void exitProgram_def(FreedomLessLessParser.Program_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(FreedomLessLessParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(FreedomLessLessParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#class_members_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_members_def(FreedomLessLessParser.Class_members_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#class_members_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_members_def(FreedomLessLessParser.Class_members_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#public_def}.
	 * @param ctx the parse tree
	 */
	void enterPublic_def(FreedomLessLessParser.Public_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#public_def}.
	 * @param ctx the parse tree
	 */
	void exitPublic_def(FreedomLessLessParser.Public_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#private_def}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_def(FreedomLessLessParser.Private_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#private_def}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_def(FreedomLessLessParser.Private_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#class_scope_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#class_scope_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_scope_def(FreedomLessLessParser.Class_scope_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#attribute_def}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_def(FreedomLessLessParser.Attribute_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#attribute_def}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_def(FreedomLessLessParser.Attribute_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#valued_expression_def}.
	 * @param ctx the parse tree
	 */
	void enterValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#valued_expression_def}.
	 * @param ctx the parse tree
	 */
	void exitValued_expression_def(FreedomLessLessParser.Valued_expression_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(FreedomLessLessParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(FreedomLessLessParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#function_call_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#function_call_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_def(FreedomLessLessParser.Function_call_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#argument_def}.
	 * @param ctx the parse tree
	 */
	void enterArgument_def(FreedomLessLessParser.Argument_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#argument_def}.
	 * @param ctx the parse tree
	 */
	void exitArgument_def(FreedomLessLessParser.Argument_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(FreedomLessLessParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(FreedomLessLessParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#param_def}.
	 * @param ctx the parse tree
	 */
	void enterParam_def(FreedomLessLessParser.Param_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#param_def}.
	 * @param ctx the parse tree
	 */
	void exitParam_def(FreedomLessLessParser.Param_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#block_def}.
	 * @param ctx the parse tree
	 */
	void enterBlock_def(FreedomLessLessParser.Block_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#block_def}.
	 * @param ctx the parse tree
	 */
	void exitBlock_def(FreedomLessLessParser.Block_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#valueless_expression_def}.
	 * @param ctx the parse tree
	 */
	void enterValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#valueless_expression_def}.
	 * @param ctx the parse tree
	 */
	void exitValueless_expression_def(FreedomLessLessParser.Valueless_expression_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#struct_def}.
	 * @param ctx the parse tree
	 */
	void enterStruct_def(FreedomLessLessParser.Struct_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#struct_def}.
	 * @param ctx the parse tree
	 */
	void exitStruct_def(FreedomLessLessParser.Struct_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#if_def}.
	 * @param ctx the parse tree
	 */
	void enterIf_def(FreedomLessLessParser.If_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#if_def}.
	 * @param ctx the parse tree
	 */
	void exitIf_def(FreedomLessLessParser.If_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#for_def}.
	 * @param ctx the parse tree
	 */
	void enterFor_def(FreedomLessLessParser.For_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#for_def}.
	 * @param ctx the parse tree
	 */
	void exitFor_def(FreedomLessLessParser.For_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#valued_attribute_def}.
	 * @param ctx the parse tree
	 */
	void enterValued_attribute_def(FreedomLessLessParser.Valued_attribute_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#valued_attribute_def}.
	 * @param ctx the parse tree
	 */
	void exitValued_attribute_def(FreedomLessLessParser.Valued_attribute_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#while_def}.
	 * @param ctx the parse tree
	 */
	void enterWhile_def(FreedomLessLessParser.While_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#while_def}.
	 * @param ctx the parse tree
	 */
	void exitWhile_def(FreedomLessLessParser.While_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#switch_def}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_def(FreedomLessLessParser.Switch_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#switch_def}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_def(FreedomLessLessParser.Switch_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#switch_case_def}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case_def(FreedomLessLessParser.Switch_case_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#switch_case_def}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case_def(FreedomLessLessParser.Switch_case_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#switch_default_def}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_default_def(FreedomLessLessParser.Switch_default_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#switch_default_def}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_default_def(FreedomLessLessParser.Switch_default_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#main_def}.
	 * @param ctx the parse tree
	 */
	void enterMain_def(FreedomLessLessParser.Main_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#main_def}.
	 * @param ctx the parse tree
	 */
	void exitMain_def(FreedomLessLessParser.Main_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(FreedomLessLessParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(FreedomLessLessParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#value_def}.
	 * @param ctx the parse tree
	 */
	void enterValue_def(FreedomLessLessParser.Value_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#value_def}.
	 * @param ctx the parse tree
	 */
	void exitValue_def(FreedomLessLessParser.Value_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(FreedomLessLessParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(FreedomLessLessParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#arithmetic_op}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#arithmetic_op}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_op(FreedomLessLessParser.Arithmetic_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#auto_assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#auto_assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAuto_assign_op(FreedomLessLessParser.Auto_assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreedomLessLessParser#auto_increm_op}.
	 * @param ctx the parse tree
	 */
	void enterAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreedomLessLessParser#auto_increm_op}.
	 * @param ctx the parse tree
	 */
	void exitAuto_increm_op(FreedomLessLessParser.Auto_increm_opContext ctx);
}