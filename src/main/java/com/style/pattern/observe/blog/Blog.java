package com.style.pattern.observe.blog;

import java.util.Observable;

/**
 * 可被观察对象
 *
 * @author leon
 * @date 2021-04-22 17:44:26
 */
public class Blog extends Observable {

	private final String name;

	public Blog(String name) {
		this.name = name;
	}

	public void publish(Question question) {
		System.out.println(" 用户: " + this.name + "发布问题: " + question.getContent());
		setChanged();
		notifyObservers(question);
	}

	public String getName() {
		return name;
	}
}
