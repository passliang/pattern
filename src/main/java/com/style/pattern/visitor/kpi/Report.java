package com.style.pattern.visitor.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-23 16:16:04
 */
public class Report {

	private final List<Employee> employeeList = new ArrayList<>();

	public Report() {
		employeeList.add(new Engineer("工程师A"));
		employeeList.add(new Engineer("工程师B"));
		employeeList.add(new Engineer("工程师C"));
		employeeList.add(new Manager("产品A"));
		employeeList.add(new Manager("产品B"));
		employeeList.add(new Manager("产品C"));
		employeeList.add(new Manager("产品D"));
	}

	public void show(Visitor visitor) {
		for (Employee employee : employeeList) {
			//动态分派
			employee.accept(visitor);
		}
	}
}
