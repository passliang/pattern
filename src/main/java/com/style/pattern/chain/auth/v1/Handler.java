package com.style.pattern.chain.auth.v1;

import com.style.pattern.chain.auth.Member;

/**
 * @author leon
 * @date 2021-04-14 22:50:59
 */
public abstract class Handler {

	protected Handler next;

	public void next(Handler next) {
		this.next = next;
	}

	/**
	 * 核心处理 逻辑
	 *
	 * @param member member
	 */
	public abstract void doHandler(Member member);
}
