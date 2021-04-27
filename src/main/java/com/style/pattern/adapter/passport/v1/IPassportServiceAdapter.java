package com.style.pattern.adapter.passport.v1;

import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:37:53
 */
public interface IPassportServiceAdapter {

	ResultMsg loginQQ(String openId);

	ResultMsg loginWechat(String openId);

	ResultMsg loginToken(String token);

	ResultMsg passwordLogin(String username, String password);
}
