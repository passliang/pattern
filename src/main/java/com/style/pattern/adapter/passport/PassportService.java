package com.style.pattern.adapter.passport;

/**
 * @author leon
 * @date 2021-04-05 21:35:02
 */
public class PassportService {

	/**
	 * 注册
	 *
	 * @param username username
	 * @param password password
	 * @return ResultMsg
	 */
	public ResultMsg register(String username, String password) {
		return new ResultMsg(0, "注册成功");
	}

	/**
	 * 登录
	 *
	 * @param username username
	 * @param password password
	 * @return ResultMsg
	 */
	public ResultMsg login(String username, String password) {
		return new ResultMsg(0, "注册成功");
	}

}
