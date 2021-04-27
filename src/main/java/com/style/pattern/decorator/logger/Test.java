package com.style.pattern.decorator.logger;

/**
 * @author leon
 * @date 2021-04-08 22:26:10
 */
public class Test {
	private static final JsonLogger logger = JsonLoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		logger.error("aaa");
	}
}
