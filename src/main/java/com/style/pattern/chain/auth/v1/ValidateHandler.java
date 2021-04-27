package com.style.pattern.chain.auth.v1;

import com.style.pattern.chain.auth.Member;

import java.util.Objects;

/**
 * @author leon
 * @date 2021-04-14 22:50:59
 */
public class ValidateHandler extends Handler {

	@Override
	public void doHandler(Member member) {
		String username = member.getUsername();
		String password = member.getPassword();
		if (Objects.isNull(username) || Objects.isNull(password)) {
			throw new RuntimeException("用户名或者密码为空");
		}
		next.doHandler(member);
	}
}
