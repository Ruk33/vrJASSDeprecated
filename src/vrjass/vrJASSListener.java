// Generated from vrJASS.g4 by ANTLR 4.5
package vrjass;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vrJASSParser}.
 */
public interface vrJASSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#inits}.
	 * @param ctx the parse tree
	 */
	void enterInits(vrJASSParser.InitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#inits}.
	 * @param ctx the parse tree
	 */
	void exitInits(vrJASSParser.InitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(vrJASSParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(vrJASSParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(vrJASSParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(vrJASSParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(vrJASSParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(vrJASSParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#arrayVariableDef}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDef(vrJASSParser.ArrayVariableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#arrayVariableDef}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDef(vrJASSParser.ArrayVariableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void enterVariableDef(vrJASSParser.VariableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void exitVariableDef(vrJASSParser.VariableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#localArrayVariableDefStat}.
	 * @param ctx the parse tree
	 */
	void enterLocalArrayVariableDefStat(vrJASSParser.LocalArrayVariableDefStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#localArrayVariableDefStat}.
	 * @param ctx the parse tree
	 */
	void exitLocalArrayVariableDefStat(vrJASSParser.LocalArrayVariableDefStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#localVariableDefStat}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDefStat(vrJASSParser.LocalVariableDefStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#localVariableDefStat}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDefStat(vrJASSParser.LocalVariableDefStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(vrJASSParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(vrJASSParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#variableAssignmentStat}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStat(vrJASSParser.VariableAssignmentStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#variableAssignmentStat}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStat(vrJASSParser.VariableAssignmentStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(vrJASSParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(vrJASSParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#propertyAssignmentStat}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignmentStat(vrJASSParser.PropertyAssignmentStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#propertyAssignmentStat}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignmentStat(vrJASSParser.PropertyAssignmentStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(vrJASSParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(vrJASSParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(vrJASSParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(vrJASSParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(vrJASSParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(vrJASSParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(vrJASSParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(vrJASSParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatBlock(vrJASSParser.StatBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatBlock(vrJASSParser.StatBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(vrJASSParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(vrJASSParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(vrJASSParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(vrJASSParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(vrJASSParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(vrJASSParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void enterLoopStat(vrJASSParser.LoopStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void exitLoopStat(vrJASSParser.LoopStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(vrJASSParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(vrJASSParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(vrJASSParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(vrJASSParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(vrJASSParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(vrJASSParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(vrJASSParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(vrJASSParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(vrJASSParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(vrJASSParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(vrJASSParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(vrJASSParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(vrJASSParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(vrJASSParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(vrJASSParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(vrJASSParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(vrJASSParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(vrJASSParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#globalVariableDefStat}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDefStat(vrJASSParser.GlobalVariableDefStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#globalVariableDefStat}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDefStat(vrJASSParser.GlobalVariableDefStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#globalDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDef(vrJASSParser.GlobalDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#globalDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDef(vrJASSParser.GlobalDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(vrJASSParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(vrJASSParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(vrJASSParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(vrJASSParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#propertyDef}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDef(vrJASSParser.PropertyDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#propertyDef}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDef(vrJASSParser.PropertyDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#structDef}.
	 * @param ctx the parse tree
	 */
	void enterStructDef(vrJASSParser.StructDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#structDef}.
	 * @param ctx the parse tree
	 */
	void exitStructDef(vrJASSParser.StructDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#scopeDef}.
	 * @param ctx the parse tree
	 */
	void enterScopeDef(vrJASSParser.ScopeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#scopeDef}.
	 * @param ctx the parse tree
	 */
	void exitScopeDef(vrJASSParser.ScopeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#requirementList}.
	 * @param ctx the parse tree
	 */
	void enterRequirementList(vrJASSParser.RequirementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#requirementList}.
	 * @param ctx the parse tree
	 */
	void exitRequirementList(vrJASSParser.RequirementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#libraryDef}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDef(vrJASSParser.LibraryDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#libraryDef}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDef(vrJASSParser.LibraryDefContext ctx);
}