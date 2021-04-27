package com.style.pattern.state.web;

/**
 * @author leon
 * @date 2021-04-18 15:18:00
 */
public abstract class UserState {

	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * 收藏
	 */
	public abstract void favorite();


	/**
	 * 评论
	 *
	 * @param comment comment
	 */
	public abstract void comment(String comment);


}
