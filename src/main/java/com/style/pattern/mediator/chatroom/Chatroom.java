package com.style.pattern.mediator.chatroom;

/**
 * @author leon
 * @date 2021-04-21 10:02:39
 */
public class Chatroom {

	public void sendMsg(User user, String msg) {
		System.out.println("[" + user.getName() + "] " + msg);
	}
}
