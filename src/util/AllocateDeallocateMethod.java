package util;

import expression.BooleanExpression;
import expression.IntegerBooleanExpression;
import expression.IntegerExpression;
import expression.MathExpression;
import expression.NullBooleanExpression;
import expression.VariableExpression;
import expression.BooleanExpression.Operator;
import expression.MathExpression.Operation;
import statement.IfStatement;
import statement.LocalVariableStatement;
import statement.MethodStatement;
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
		VariableExpression recycleIndexZero = new VariableExpression(this.recycle, zeroExpression);
		
		LocalVariableSymbol instanceSymbol = new LocalVariableSymbol("instance", this.parent.getType(), false, this.allocateMethod);
		LocalVariableStatement instance = new LocalVariableStatement(instanceSymbol, recycleIndexZero);
		VariableExpression instanceExpression = new VariableExpression(instanceSymbol, null);
		
		BooleanExpression recycleIsNull = new BooleanExpression(recycleIndexZero, Operator.EQUAL, zeroExpression);
		IfStatement ifStatement = new IfStatement(recycleIsNull);
		
		MathExpression instancePlusOne = new MathExpression(instanceExpression, Operation.PLUS, new IntegerExpression(1));
		ifStatement.addThenStatement(new SetVariableStatement(recycleIndexZero, instancePlusOne));
		ifStatement.addElseStatement(new SetVariableStatement(recycleIndexZero, new VariableExpression(this.recycle, instanceExpression)));
		
		ReturnStatement returnStatement = new ReturnStatement(instanceExpression);
		
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
		return new MethodStatement(this.allocateMethod).toJASS();
	}
	
	public static void main(String[] args) {
		System.out.println(new AllocateDeallocateMethod(new ClassSymbol("Person", Visibility.PUBLIC, null)));
	}
	
}
