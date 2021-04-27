package com.style.pattern.chain.auth.v1;

import com.style.pattern.chain.auth.Member;

/**
 * @author leon
 * @date 2021-04-14 22:08:15
 */
public class MemberService {


	public static void login(String username, String password) {
		ValidateHandler validateHandler = new ValidateHandler();
		BlackListCheckHandler blackListCheckHandler = new BlackListCheckHandler();
		LoginHandler loginHandler = new LoginHandler();
		validateHandler.next(blackListCheckHandler);
		blackListCheckHandler.next(loginHandler);
		validateHandler.doHandler(new Member(username, password));
	}
}
