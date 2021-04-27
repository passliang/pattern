package com.style.pattern.brige.message;

/**
 * 抽奖类 保存 消息发送类型实现类引用
 *
 * @author leon
 * @date 2021-04-04 00:00:33
 */
public abstract class AbstractMessage implements IMessage {

	protected IMessage message;

	public void setMessage(IMessage message) {
		this.message = message;
	}

	@Override
	public void send(String message, String toUser) {
		this.message.send(message,toUser);
	}
}
