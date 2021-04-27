package com.style.pattern.mediator.chatroom;

/**
 * @author leon
 * @date 2021-04-21 10:06:00
 */
public class Test {
	public static void main(String[] args) {
		Chatroom chatroom = new Chatroom();
		User tom = new User("tom", chatroom);
		User jack = new User("jack", chatroom);
		tom.sendMsg("I am tom");
		jack.sendMsg("I am jack");
		//1. java Timer
		//java.util.Timer.schedule(java.util.TimerTask, long)
		//java.util.Timer.schedule(java.util.TimerTask, java.util.Date)
		//java.util.Timer.schedule(java.util.TimerTask, long, long)
		//统一调度
		//优点
		//1. 减少类之间依赖 将多对多转化为多对1  降低类之间耦合
		//2 类之间各司其职 符合迪米特法则
		//缺点
		//1.中介者将原本多个对象之间的依赖 变为中介者和对象之间的依赖
		//当同事类过多,中介者就会变得越臃肿 变得复杂难以维护

	}
}
