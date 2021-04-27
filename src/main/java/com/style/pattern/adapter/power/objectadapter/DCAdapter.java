package com.style.pattern.adapter.power.objectadapter;

/**
 * @author leon
 * @date 2021-04-04 23:23:44
 */
public class DCAdapter implements DC5 {

	private AC220 ac220;

	public DCAdapter(AC220 ac220) {
		this.ac220 = ac220;
	}

	@Override
	public int output5V() {
		int output220 = ac220.output220V();
		int output5 = output220 / 44;
		System.out.println("适配器输出5V交流电");
		return output5;
	}
}
