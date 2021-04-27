package com.style.pattern.delegate;

/**
 * @author leon
 * @date 2021-04-10 13:38:55
 */
public class EmployeeA implements Employee {
	@Override
	public void doTask(String task) {
		System.out.println("我是员工A 开始做:" + task + "工作");
	}
}
