package com.style.pattern.brige.message;

/**
 * @author leon
 * @date 2021-04-04 00:12:40
 */
public class Test {
	public static void main(String[] args) {
		AbstractMessage normal = new NormalMessage();
		normal.setMessage(new EmailMessage());
		normal.send("加班申请","老王");

		AbstractMessage urgency = new UrgencyMessage();
		urgency.setMessage(new EmailMessage());
		urgency.send("加班申请","老王");
	}
}
