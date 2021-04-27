package com.style.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-12 22:15:43
 */
public class AliPayment extends Payment {

	@Override
	public String name() {
		return "支付宝";
	}

	@Override
	public String key() {
		return "ali";
	}

	@Override
	public BigDecimal query() {
		return new BigDecimal("200.00");
	}
}
