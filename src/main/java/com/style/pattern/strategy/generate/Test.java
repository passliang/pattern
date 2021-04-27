package com.style.pattern.strategy.generate;

/**
 * @author leon
 * @date 2021-04-12 21:35:46
 */
public class Test {
	public static void main(String[] args) {
		IStrategy strategy = new StrategyA();
		Context context = new Context(strategy);
		context.algorithm();
	}
}
