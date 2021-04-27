package com.style.pattern.strategy.generate;

/**
 * @author leon
 * @date 2021-04-12 21:34:52
 */
public class Context {

	private final IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void algorithm() {
		strategy.algorithm();
	}
}
