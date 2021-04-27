package com.style.pattern.observe.blog;

/**
 * @author leon
 * @date 2021-04-22 17:48:27
 */
public class Question {
	private final String content;

	public Question(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Question{" +
				"content='" + content + '\'' +
				'}';
	}
}
