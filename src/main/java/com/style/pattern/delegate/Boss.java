package com.style.pattern.delegate;

/**
 * @author leon
 * @date 2021-04-10 13:46:13
 */
public class Boss {

	public void command(String task, Leader leader) {
		leader.doTask(task);
	}
}
