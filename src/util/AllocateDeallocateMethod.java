package util;

import expression.ComparisonBooleanExpression;
import expression.ComparisonBooleanExpression.Operator;
import expression.IntegerExpression;
import expression.MathExpression;
import expression.VariableExpression;
import expression.MathExpression.Operation;
import statement.FunctionStatement;
import statement.IfStatement;
import statement.LocalVariableStatement;
import statement.ReturnStatement;
import statement.SetVariableStatement;
import symbol.ClassSymbol;
import symbol.LocalVariableSymbol;
import symbol.MethodSymbol;
import symbol.PropertySymbol;
import symbol.VariableSymbol;
import symbol.Visibility;

public class AllocateDeallocateMethod {

	protected ClassSymbol parent;
	protected VariableSymbol recycle;
	protected MethodSymbol allocateMethod;
	protected MethodSymbol deallocateMethod;

	protected void defineAllocate() {
		this.allocateMethod = new MethodSymbol("allocate", true, Visibility.PRIVATE, this.parent);
		this.allocateMethod.setReturnType(this.parent.getType());

		IntegerExpression zeroExpression = new IntegerExpression(0);
		VariableExpression recycleIndexZero = new VariableExpression(this.recycle, zeroExpression, this.allocateMethod);

		LocalVariableSymbol instanceSymbol = new LocalVariableSymbol("instance", this.parent.getType(), false, this.allocateMethod);
		LocalVariableStatement instance = new LocalVariableStatement(instanceSymbol, recycleIndexZero);
		VariableExpression instanceExpression = new VariableExpression(instanceSymbol, null, this.allocateMethod);

		ComparisonBooleanExpression recycleIsNull = new ComparisonBooleanExpression(Operator.EQUAL);
		recycleIsNull.setExpressionA(recycleIndexZero);
		recycleIsNull.setExpressionB(zeroExpression);

		IfStatement ifStatement = new IfStatement(this.allocateMethod, recycleIsNull);

		MathExpression instancePlusOne = new MathExpression(Operation.PLUS);
		instancePlusOne.setExpressionA(instanceExpression);
		instancePlusOne.setExpressionB(new IntegerExpression(1));

		ifStatement.addThenStatement(new SetVariableStatement(this.allocateMethod, recycleIndexZero, instancePlusOne));
		ifStatement.addElseStatement(new SetVariableStatement(this.allocateMethod, recycleIndexZero, new VariableExpression(this.recycle, instanceExpression, this.allocateMethod)));

		ReturnStatement returnStatement = new ReturnStatement(this.allocateMethod, instanceExpression);

		this.allocateMethod.defineStatement(instance);
		this.allocateMethod.defineStatement(ifStatement);
		this.allocateMethod.defineStatement(returnStatement);
	}

	public AllocateDeallocateMethod(ClassSymbol parent) {
		this.parent = parent;
		this.recycle = new PropertySymbol("recycle", this.parent.getType(), true, true, Visibility.PRIVATE, this.parent);

		this.defineAllocate();
	}

	public String toString() {
		return new FunctionStatement(this.allocateMethod).toJASS();
	}

	public static void main(String[] args) {
		System.out.println(new AllocateDeallocateMethod(new ClassSymbol("Person", Visibility.PUBLIC, null)));
	}

}
