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
	 * Enter a parse tree produced by {@link vrJASSParser#nonePublicPrivateVisibility}.
	 * @param ctx the parse tree
	 */
	void enterNonePublicPrivateVisibility(vrJASSParser.NonePublicPrivateVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#nonePublicPrivateVisibility}.
	 * @param ctx the parse tree
	 */
	void exitNonePublicPrivateVisibility(vrJASSParser.NonePublicPrivateVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#publicPrivateProtectedVisiblity}.
	 * @param ctx the parse tree
	 */
	void enterPublicPrivateProtectedVisiblity(vrJASSParser.PublicPrivateProtectedVisiblityContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#publicPrivateProtectedVisiblity}.
	 * @param ctx the parse tree
	 */
	void exitPublicPrivateProtectedVisiblity(vrJASSParser.PublicPrivateProtectedVisiblityContext ctx);
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
	 * Enter a parse tree produced by {@link vrJASSParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(vrJASSParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(vrJASSParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#methodExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(vrJASSParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#methodExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(vrJASSParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(vrJASSParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(vrJASSParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(vrJASSParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(vrJASSParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(vrJASSParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(vrJASSParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreFunctionExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreFunctionExpression(vrJASSParser.IgnoreFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreFunctionExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreFunctionExpression(vrJASSParser.IgnoreFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(vrJASSParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(vrJASSParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(vrJASSParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(vrJASSParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(vrJASSParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(vrJASSParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(vrJASSParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(vrJASSParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(vrJASSParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(vrJASSParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(vrJASSParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(vrJASSParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreMethodExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreMethodExpression(vrJASSParser.IgnoreMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreMethodExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreMethodExpression(vrJASSParser.IgnoreMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(vrJASSParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(vrJASSParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableArrayExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayExpression(vrJASSParser.VariableArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableArrayExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayExpression(vrJASSParser.VariableArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealExpression(vrJASSParser.RealExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealExpression(vrJASSParser.RealExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpression(vrJASSParser.PropertyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyExpression}
	 * labeled alternative in {@link vrJASSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpression(vrJASSParser.PropertyExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link vrJASSParser#debugStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebugStatement(vrJASSParser.DebugStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#debugStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebugStatement(vrJASSParser.DebugStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(vrJASSParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(vrJASSParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(vrJASSParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(vrJASSParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(vrJASSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(vrJASSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(vrJASSParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(vrJASSParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(vrJASSParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(vrJASSParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#exitWhenStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitWhenStatement(vrJASSParser.ExitWhenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#exitWhenStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitWhenStatement(vrJASSParser.ExitWhenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(vrJASSParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(vrJASSParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(vrJASSParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(vrJASSParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(vrJASSParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(vrJASSParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(vrJASSParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(vrJASSParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(vrJASSParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(vrJASSParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(vrJASSParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(vrJASSParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(vrJASSParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(vrJASSParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#globalVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableStatement(vrJASSParser.GlobalVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#globalVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableStatement(vrJASSParser.GlobalVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#localVariableArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableArrayStatement(vrJASSParser.LocalVariableArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#localVariableArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableArrayStatement(vrJASSParser.LocalVariableArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#localVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableStatement(vrJASSParser.LocalVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#localVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableStatement(vrJASSParser.LocalVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#setVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariableStatement(vrJASSParser.SetVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#setVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariableStatement(vrJASSParser.SetVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#propertyVisibility}.
	 * @param ctx the parse tree
	 */
	void enterPropertyVisibility(vrJASSParser.PropertyVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#propertyVisibility}.
	 * @param ctx the parse tree
	 */
	void exitPropertyVisibility(vrJASSParser.PropertyVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#propertyStatement}.
	 * @param ctx the parse tree
	 */
	void enterPropertyStatement(vrJASSParser.PropertyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#propertyStatement}.
	 * @param ctx the parse tree
	 */
	void exitPropertyStatement(vrJASSParser.PropertyStatementContext ctx);
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
	 * Enter a parse tree produced by {@link vrJASSParser#globalBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalBlockStatement(vrJASSParser.GlobalBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#globalBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalBlockStatement(vrJASSParser.GlobalBlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link vrJASSParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(vrJASSParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(vrJASSParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodStatement(vrJASSParser.MethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodStatement(vrJASSParser.MethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#structBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructBlockStatement(vrJASSParser.StructBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#structBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructBlockStatement(vrJASSParser.StructBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vrJASSParser#scopeBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterScopeBlockStatement(vrJASSParser.ScopeBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#scopeBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitScopeBlockStatement(vrJASSParser.ScopeBlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link vrJASSParser#libraryBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLibraryBlockStatement(vrJASSParser.LibraryBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vrJASSParser#libraryBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLibraryBlockStatement(vrJASSParser.LibraryBlockStatementContext ctx);
}