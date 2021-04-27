package com.style.pattern.adapter.power.objectadapter;

/**
 * @author leon
 * @date 2021-04-04 23:27:58
 */
public class Test {

	public static void main(String[] args) {
		DCAdapter adapter = new DCAdapter(new AC220());
		adapter.output5V();
	}
}
