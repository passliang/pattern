package com.style.pattern.delegate;

/**
 * @author leon
 * @date 2021-04-10 13:38:55
 */
public class EmployeeB implements Employee {
	@Override
	public void doTask(String task) {
		System.out.println("我是员工B 开始做:" + task + "工作");
	}
}
