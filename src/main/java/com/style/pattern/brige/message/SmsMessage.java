package com.style.pattern.brige.message;

/**
 * 发送方式维度
 *
 * @author leon
 * @date 2021-04-03 23:51:38
 */
public class SmsMessage implements IMessage {

	@Override
	public void send(String message, String toUser) {
		System.out.println("短信消息发送:" + message + "给" + toUser);
	}
}
