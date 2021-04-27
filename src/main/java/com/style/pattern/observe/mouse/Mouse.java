package com.style.pattern.observe.mouse;

/**
 * @author leon
 * @date 2021-04-23 10:17:51
 */
public class Mouse extends MouseListener {

	public void click() {
		System.out.println("调用鼠标单击事件");
		trigger(EventType.CLICK);
	}

	public void move() {
		System.out.println("调用鼠标移动事件");
		trigger(EventType.MOVE);
	}
}
