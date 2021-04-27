package com.style.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-12 22:15:43
 */
public class WechatPayment extends Payment {

	@Override
	public String name() {
		return "微信";
	}

	@Override
	public String key() {
		return "wechat";
	}

	@Override
	public BigDecimal query() {
		return new BigDecimal("900.00");
	}
}
