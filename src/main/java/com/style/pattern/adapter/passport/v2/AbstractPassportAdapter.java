package com.style.pattern.adapter.passport.v2;

import com.style.pattern.adapter.passport.PassportService;
import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:50:54
 */
public abstract class AbstractPassportAdapter extends PassportService implements IPassportAdapter {

	@Override
	public abstract boolean support(Object obj);

	@Override
	public ResultMsg login(String username, String password, Object obj) {
		if (null == password) {
			password = "THIRD LOGIN";
		}
		super.register(username, password);
		return super.login(username, password);
	}
}
