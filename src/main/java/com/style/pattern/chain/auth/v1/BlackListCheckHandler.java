package com.style.pattern.chain.auth.v1;

import com.style.pattern.chain.auth.Member;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-14 22:50:59
 */
public class BlackListCheckHandler extends Handler {

	public static List<String> blackList = Arrays.asList("1", "2");

	@Override
	public void doHandler(Member member) {
		String username = member.getUsername();
		//校验是否黑名单
		if (blackList.contains(username)) {
			throw new RuntimeException("黑名单用户不允许登录");
		}
		next.doHandler(member);
	}
}
