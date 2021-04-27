package com.style.pattern.observe.mouse;

/**
 * @author leon
 * @date 2021-04-23 11:52:22
 */
public class Test {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		EventCallBack eventCallBack = new EventCallBack();
		mouse.addListener(EventType.CLICK, new Event("点击事件", eventCallBack));
		mouse.addListener(EventType.MOVE, new Event("移动事件", eventCallBack));

		mouse.click();
		mouse.move();

		//jdk ServletContextListener
		// spring ContextLoaderListener
		//优点
		//1. 观察者与被观察者松耦合 (抽象耦合) 符合依赖倒置原则
		//2. 分离了表示层(观察者)与数据逻辑层(被观察者) 并且建立了触发极致 使得数据变化响应到多个表示层上
		//3. 实现一对多通讯机制  支持事件注册机制 支持兴趣分发机制 当被观察者触发事件时 只有感兴趣的观察者可以收到通知
		//缺点
		//1. 观察者数量过多 则事件通知会耗时较长
		//2. 事件通知呈线性关系  如果其中一个观察者处理事件卡壳 会影响到后续观察者接收时间
		//3. 如果观察者和被观察者存在循环依赖 则可能造成两者之间循环调用 造成系统崩溃

	}
}
