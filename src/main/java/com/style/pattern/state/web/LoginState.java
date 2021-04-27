package com.style.pattern.state.web;

/**
 * @author leon
 * @date 2021-04-18 15:18:00
 */
public class LoginState extends UserState {

	@Override
	public void favorite() {
		System.out.println("收藏");
	}

	@Override
	public void comment(String comment) {
		System.out.println(comment);
	}
}
