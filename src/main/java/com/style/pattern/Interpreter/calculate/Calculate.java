package com.style.pattern.Interpreter.calculate;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

/**
 * 计算器
 *
 * @author leon
 * @date 2021-04-21 10:50:55
 */
public class Calculate {

	private Stack<Expression> expressions = new Stack<>();

	private final String expression;

	public Calculate(String expression) {
		this.expression = expression;
		this.parse(expression);
	}

	private void parse(String expression) {
		if (StringUtils.isEmpty(expression)) {
			return;
		}
		String[] split = expression.split(" ");
		for (int i = 0; i < split.length; i++) {
			String operate = split[i];
			if (isOperate(operate)) {
				Expression left = expressions.pop();
				String rightStr = split[++i];
				Expression right = new FinalExpression(Integer.valueOf(rightStr));
				System.out.println("应用操作符号:" + operate);
				expressions.push(getNonFinalExpression(left, right, operate));
			} else {
				expressions.push(new FinalExpression(Integer.valueOf(operate)));
			}
		}


	}

	public Integer calculate() {
		return this.expressions.pop().interpreter();
	}


	public boolean isOperate(String operate) {
		return ("+".equalsIgnoreCase(operate) || "-".equalsIgnoreCase(operate) || "*".equalsIgnoreCase(operate) || "/".equalsIgnoreCase(operate));
	}


	public Expression getNonFinalExpression(Expression left, Expression right, String operate) {
		if ("+".equalsIgnoreCase(operate)) {
			return new AddNonFinalExpression(left, right);
		} else if ("-".equalsIgnoreCase(operate)) {
			return new SubtractNonFinalExpression(left, right);
		} else if ("*".equalsIgnoreCase(operate)) {
			return new MultiplyNonFinalExpression(left, right);
		} else if ("/".equalsIgnoreCase(operate)) {
			return new DivideNonFinalExpression(left, right);
		}
		return null;
	}


}
