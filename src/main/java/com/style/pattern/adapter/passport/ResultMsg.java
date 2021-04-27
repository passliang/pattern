package com.style.pattern.adapter.passport;

/**
 * @author leon
 * @date 2021-04-05 21:27:44
 */
public class ResultMsg {
	private Integer code;
	private String msg;

	public ResultMsg(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
