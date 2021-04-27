package com.style.pattern.chain.auth.v2;

import com.style.pattern.chain.auth.Member;

/**
 * @author leon
 * @date 2021-04-14 22:50:59
 */
public class LoginHandler extends Handler {

	@Override
	public void doHandler(Member member) {
		String password = member.getPassword();
		//检验密码
		String defaultPassword = "123456";
		if (!defaultPassword.equalsIgnoreCase(password)) {
			throw new RuntimeException("密码错误");
		}
		System.out.println("登录成功");
	}
}
