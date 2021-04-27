package com.style.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-12 22:15:43
 */
public class UnionPayment extends Payment {

	@Override
	public String name() {
		return "连连";
	}

	@Override
	public String key() {
		return "union";
	}

	@Override
	public BigDecimal query() {
		return new BigDecimal("500.00");
	}
}
