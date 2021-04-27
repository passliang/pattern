package com.style.pattern.proxy.staticproxy;

import com.style.pattern.proxy.IPerson;

/**
 * @author leon
 * @date 2021-04-25 13:40:45
 */
public class ZhangLaoSan implements IPerson {
	private final ZhangSan zhangSan;

	public ZhangLaoSan(ZhangSan zhangSan) {
		this.zhangSan = zhangSan;
	}

	@Override
	public void findLove() {
		System.out.println("张老三 观察是否正点 是否得体");
		zhangSan.findLove();
		System.out.println("可以 开始交往");
	}
}
