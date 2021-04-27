package com.style.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author leon
 * @date 2021-04-23 15:31:57
 */
public class Manager extends Employee {

	private String name;

	public Manager(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public int getProducts() {
		return new Random().nextInt(10);
	}
}
