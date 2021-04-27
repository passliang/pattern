package com.style.pattern.adapter.passport.v2;

import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:53:07
 */
public class LoginForWechatAdapter extends AbstractPassportAdapter {

	@Override
	public boolean support(Object obj) {
		return obj instanceof LoginForWechatAdapter;
	}

	@Override
	public ResultMsg login(String openId, String password, Object obj) {
		if (!support(obj)) {
			return null;
		}
		System.out.println("=====wechat登录=====");
		return super.login(openId, null);
	}
}
