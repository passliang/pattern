package com.style.pattern.proxy.staticproxy;

import com.style.pattern.proxy.IPerson;

/**
 * @author leon
 * @date 2021-04-25 13:40:15
 */
public class ZhangSan implements IPerson {
	@Override
	public void findLove() {
		System.out.println("张三找对象");
	}
}
