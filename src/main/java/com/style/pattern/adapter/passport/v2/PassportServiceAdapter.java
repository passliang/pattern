package com.style.pattern.adapter.passport.v2;

import com.style.pattern.adapter.passport.PassportService;
import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:37:53
 */
public class PassportServiceAdapter implements IPassportServiceAdapter {

	@Override
	public ResultMsg loginQQ(String openId) {
		return processLogin(openId, null, LoginForWechatAdapter.class);
	}

	@Override
	public ResultMsg loginWechat(String openId) {
		return processLogin(openId, null, LoginForWechatAdapter.class);
	}

	@Override
	public ResultMsg loginToken(String token) {
		return processLogin(token, null, LoginForTokenAdapter.class);
	}

	@Override
	public ResultMsg passwordLogin(String username, String password) {
		return processLogin(username, password, LoginForPasswordAdapter.class);
	}

	public ResultMsg processLogin(String id, String password, Class<? extends AbstractPassportAdapter> clazz) {
		try {
			AbstractPassportAdapter abstractPassportAdapter = clazz.newInstance();
			boolean support = abstractPassportAdapter.support(abstractPassportAdapter);
			if (support) {
				return abstractPassportAdapter.login(id, password, abstractPassportAdapter);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
