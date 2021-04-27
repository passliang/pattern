package com.style.pattern.adapter.passport.v2;

import com.style.pattern.adapter.passport.ResultMsg;

/**
 * @author leon
 * @date 2021-04-05 21:49:05
 */
public interface IPassportAdapter {

	boolean support(Object obj);

	ResultMsg login(String username, String password,Object obj);
}
