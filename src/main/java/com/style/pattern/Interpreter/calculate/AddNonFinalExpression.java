package com.style.pattern.Interpreter.calculate;

/**
 * 添加
 *
 * @author leon
 * @date 2021-04-21 11:27:50
 */
public class AddNonFinalExpression extends AbstractNonFinalExpression {

	public AddNonFinalExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Integer interpreter() {
		return left.interpreter() + right.interpreter();
	}


}
