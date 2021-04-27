package com.style.pattern.Interpreter.calculate;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author leon
 * @date 2021-04-21 22:34:15
 */
public class SpringTest {
	public static void main(String[] args) {
		SpelExpressionParser parse = new SpelExpressionParser();
		Expression expression = parse.parseExpression("3+3*2+5*5");
		System.out.println(expression.getValue());
	}
}
