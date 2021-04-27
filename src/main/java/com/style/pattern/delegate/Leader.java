package com.style.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon
 * @date 2021-04-10 13:38:55
 */
public class Leader implements Employee {

	private final Map<String, Employee> employeeMap = new HashMap<>();

	public Leader() {
		employeeMap.put("python", new EmployeeA());
		employeeMap.put("海报", new EmployeeA());
	}

	@Override
	public void doTask(String task) {
		if (!employeeMap.containsKey(task)) {
			System.out.println("这个" + task + "任务能力范围之外");
			return;
		}
		employeeMap.get(task).doTask(task);
	}
}
