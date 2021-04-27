package com.style.pattern.adapter.power.classadapter;

/**
 * @author leon
 * @date 2021-04-04 23:23:44
 */
public class DCAdapter extends AC220 implements DC5 {
	@Override
	public int output5V() {
		int output220 = super.output220V();
		int output5 = output220 / 44;
		System.out.println("适配器输出5V交流电");
		return output5;
	}
}
