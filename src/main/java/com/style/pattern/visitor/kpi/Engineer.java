package com.style.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author leon
 * @date 2021-04-23 15:31:57
 */
public class Engineer extends Employee {

	private String name;

	public Engineer(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public int getCodeLines() {
		return new Random().nextInt(10 * 10000);
	}
}
