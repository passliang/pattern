package com.style.pattern.adapter.passport.v2;

import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:53:07
 */
public class LoginForPasswordAdapter extends AbstractPassportAdapter {

	@Override
	public boolean support(Object obj) {
		return obj instanceof LoginForPasswordAdapter;
	}

	@Override
	public ResultMsg login(String username, String password, Object obj) {
		if (!support(obj)) {
			return null;
		}
		System.out.println("======password登录======");

		return super.login(username, password);
	}
}
