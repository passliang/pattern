package com.style.pattern.chain.auth.old;

import com.style.pattern.chain.auth.Member;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author leon
 * @date 2021-04-14 22:08:15
 */
public class MemberService {

	public static List<String> blackList = Arrays.asList("1", "2");

	public static void login(Member member) {
		String username = member.getUsername();
		String password = member.getPassword();
		if (Objects.isNull(username) || Objects.isNull(password)) {
			throw new RuntimeException("用户名或者密码为空");
		}

		//校验是否黑名单
		if (blackList.contains(username)) {
			throw new RuntimeException("黑名单用户不允许登录");
		}

		//检验密码
		String defaultPassword = "123456";
		if (defaultPassword.equalsIgnoreCase(password)) {
			System.out.println("登录成功");
		}

	}
}
