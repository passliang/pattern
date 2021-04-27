package com.style.pattern.state.web;

/**
 * @author leon
 * @date 2021-04-18 15:27:18
 */
public class Context {

	public static final UserState LOGIN = new LoginState();

	public static final UserState UN_LOGIN = new UnLoginState();

	{
		//构造块 设置上下文
		LOGIN.setContext(this);
		UN_LOGIN.setContext(this);
	}


	private UserState state = UN_LOGIN;

	public void setState(UserState state) {
		this.state = state;
	}

	public UserState getState() {
		return this.state;
	}

	public void favorite() {
		this.state.favorite();
	}

	public void comment(String comment) {
		this.state.comment(comment);
	}

}
