package com.style.pattern.observe.mouse;

/**
 * 事件
 *
 * @author leon
 * @date 2021-04-23 11:21:46
 */
public class Event {

	private final String name;

	private final EventCallBack callBack;

	public Event(String name, EventCallBack callBack) {
		this.name = name;
		this.callBack = callBack;
	}

	public String getName() {
		return name;
	}

	public EventCallBack getCallBack() {
		return callBack;
	}
}
