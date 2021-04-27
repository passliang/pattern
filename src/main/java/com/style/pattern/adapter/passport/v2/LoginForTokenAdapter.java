package com.style.pattern.adapter.passport.v2;

import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:53:07
 */
public class LoginForTokenAdapter extends AbstractPassportAdapter {

	@Override
	public boolean support(Object obj) {
		return obj instanceof LoginForTokenAdapter;
	}

	@Override
	public ResultMsg login(String token, String password, Object obj) {
		if (!support(obj)) {
			return null;
		}
		System.out.println("======token登录======");
		return super.login(token, null);
	}
}
