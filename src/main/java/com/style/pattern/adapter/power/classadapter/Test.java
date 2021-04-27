package com.style.pattern.adapter.power.classadapter;

/**
 * @author leon
 * @date 2021-04-04 23:27:58
 */
public class Test {
	public static void main(String[] args) {
		DCAdapter adapter = new DCAdapter();
		adapter.output5V();
		adapter.output220V();
	}
}
