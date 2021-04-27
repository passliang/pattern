package com.style.pattern.brige.message;

/**
 * 紧急消息
 *
 * @author leon
 * @date 2021-04-03 23:53:40
 */
public class UrgencyMessage extends AbstractMessage {


	@Override
	public void send(String message, String toUser) {
		message = "[紧急]" + message;
		super.message.send(message, toUser);
	}
}
