package com.style.pattern.mediator.chatroom;

/**
 * @author leon
 * @date 2021-04-21 10:02:46
 */
public class User {
	private String name;
	private Chatroom chatroom;

	public User(String name, Chatroom chatroom) {
		this.name = name;
		this.chatroom = chatroom;
	}

	public String getName() {
		return name;
	}


	public void sendMsg(String msg) {
		chatroom.sendMsg(this, msg);
	}
}
