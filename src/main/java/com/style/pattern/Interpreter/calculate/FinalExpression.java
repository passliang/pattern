package com.style.pattern.Interpreter.calculate;

/**
 * 终结表达式
 *
 * @author leon
 * @date 2021-04-21 11:27:50
 */
public class FinalExpression implements Expression {

	private final Integer value;

	public FinalExpression(Integer value) {
		this.value = value;
	}

	@Override
	public Integer interpreter() {
		return value;
	}


}
