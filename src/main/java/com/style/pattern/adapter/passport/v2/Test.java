package com.style.pattern.adapter.passport.v2;

/**
 * @author leon
 * @date 2021-04-05 22:11:37
 */
public class Test {
	public static void main(String[] args) {
		IPassportServiceAdapter passportAdapter = new PassportServiceAdapter();
		passportAdapter.loginQQ("123123");
	}
}
