package com.style.pattern.observe.blog;

import java.util.Observable;
import java.util.Observer;

/**
 * @author leon
 * @date 2021-04-22 17:54:31
 */
public class Creator implements Observer {
	private final String username;

	public Creator(String username) {
		this.username = username;
	}

	@Override
	public void update(Observable o, Object arg) {
		Blog publisher = (Blog) o;
		Question question = (Question) arg;
		System.out.println("博客创建人:" + username + " 接收到:" + publisher.getName() + ",提交的问题: " + question.getContent());
	}

	public String getUsername() {
		return username;
	}
}
