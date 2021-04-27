package com.style.pattern.Interpreter.calculate;

/**
 * 除
 *
 * @author leon
 * @date 2021-04-21 11:27:50
 */
public class DivideNonFinalExpression extends AbstractNonFinalExpression {

	public DivideNonFinalExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Integer interpreter() {
		return left.interpreter() / right.interpreter();
	}


}
