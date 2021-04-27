package com.style.pattern.Interpreter.calculate;

/**
 * 终结表达式
 *
 * @author leon
 * @date 2021-04-21 11:27:50
 */
public abstract class AbstractNonFinalExpression implements Expression {

	protected final Expression left;

	protected final Expression right;

	public AbstractNonFinalExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * 解释执行
	 *
	 * @return Integer
	 */
	@Override
	public abstract Integer interpreter();
}
