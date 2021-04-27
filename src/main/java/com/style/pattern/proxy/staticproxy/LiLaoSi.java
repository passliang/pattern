package com.style.pattern.proxy.staticproxy;

import com.style.pattern.proxy.IPerson;

/**
 * @author leon
 * @date 2021-04-25 13:40:15
 */
public class LiLaoSi implements IPerson {

	private final LiSi liSi;

	public LiLaoSi(LiSi liSi) {
		this.liSi = liSi;
	}

	@Override
	public void findLove() {
		System.out.println("李老四 观察是否正点");
		liSi.findLove();
		System.out.println("可以 开始交往");
	}
}
