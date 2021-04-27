package com.style.pattern.proxy.dynamic.jdk;

import com.style.pattern.proxy.IPerson;

/**
 * @author leon
 * @date 2021-04-25 13:40:15
 */
public class LiSi implements IPerson {
	@Override
	public void findLove() {
		System.out.println("李四要求:有车有房有存款");
	}
}
