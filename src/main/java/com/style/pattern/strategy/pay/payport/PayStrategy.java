package com.style.pattern.strategy.pay.payport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-12 22:26:03
 */
public class PayStrategy {

	/**
	 * 支付方式
	 */
	private static final List<String> PAYMENT_NAMES = new ArrayList<>();

	static {
		AliPayment aliPayment = new AliPayment();
		WechatPayment wechatPayment = new WechatPayment();
		UnionPayment unionPayment = new UnionPayment();
		PAYMENT_NAMES.add(aliPayment.key());
		PAYMENT_NAMES.add(wechatPayment.key());
		PAYMENT_NAMES.add(unionPayment.key());
	}

	public static Payment getPayment(String key) {
		if (PAYMENT_NAMES.contains(key)) {
			return Payment.paymentMap.get(key);
		} else {
			return Payment.paymentMap.get("ali");
		}
	}

	private PayStrategy() {

	}

}
