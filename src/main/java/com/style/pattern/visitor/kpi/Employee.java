package com.style.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author leon
 * @date 2021-04-23 15:31:57
 */
public abstract class Employee {
	protected String name;
	protected Integer kpi;

	public Employee(String name) {
		this.name = name;
		this.kpi = new Random().nextInt(10);
	}

	/**
	 * 访问
	 *
	 * @param visitor visitor
	 */
	public abstract void accept(Visitor visitor);

	public String getName() {
		return name;
	}

	public Integer getKpi() {
		return kpi;
	}
}
