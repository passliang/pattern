package com.style.pattern.state.web;

/**
 * @author leon
 * @date 2021-04-18 15:18:00
 */
public class UnLoginState extends UserState {

	@Override
	public void favorite() {
		this.switchStatus();
		this.context.getState().favorite();
	}

	@Override
	public void comment(String comment) {
		this.switchStatus();
		this.context.getState().comment(comment);
	}

	private void switchStatus() {
		System.out.println("切换登录");
		this.context.setState(Context.LOGIN);
	}

}
