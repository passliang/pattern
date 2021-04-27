package com.style.pattern.adapter.passport.v1;

import com.style.pattern.adapter.passport.PassportService;
import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:37:53
 */
public class PassportServiceAdapter extends PassportService implements IPassportServiceAdapter {

	@Override
	public ResultMsg loginQQ(String openId) {
		return multiLogin(openId, null);
	}

	@Override
	public ResultMsg loginWechat(String openId) {
		return multiLogin(openId, null);
	}

	@Override
	public ResultMsg loginToken(String token) {
		return multiLogin(token, null);
	}

	@Override
	public ResultMsg passwordLogin(String username, String password) {
		return multiLogin(username, password);
	}


	public ResultMsg multiLogin(String username, String password) {
		super.register(username, password);
		return super.login(username, password);
	}
}
