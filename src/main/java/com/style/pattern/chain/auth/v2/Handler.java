package com.style.pattern.chain.auth.v2;

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


	public static class Builder {

		private Handler head;
		private Handler tail;

		public Builder addHandler(Handler handler) {
			if (head == null) {
				this.head = this.tail = handler;
				return this;
			}

			this.tail.next = handler;
			this.tail = handler;
			return this;
		}


		public Handler build() {
			return this.head;
		}
	}
}
