package com.style.pattern.observe.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author leon
 * @date 2021-04-22 22:09:47
 */
@SuppressWarnings("all")
public class CustomEvent {

	@Subscribe
	public void observe(String str) {
		System.out.println("执行observe 参数: " + str);
	}

	@Subscribe
	public void observe2(Integer source) {
		System.out.println("执行observe2 参数: " + source);
	}
}
