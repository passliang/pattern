package com.style.pattern.strategy.pay.payport;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon
 * @date 2021-04-12 22:15:43
 */
public abstract class Payment {

	public static Map<String, Payment> paymentMap = new HashMap<>();

	public Payment() {
		paymentMap.put(key(), this);
	}

	/**
	 * 支付方式
	 *
	 * @return String
	 */
	public abstract String name();

	/**
	 * 支付编码
	 *
	 * @return String
	 */
	public abstract String key();


	public String pay(String name, BigDecimal price, Payment payment) {
		BigDecimal query = payment.query();
		if (query.compareTo(price) >= 0) {
			BigDecimal subtract = query.subtract(price);
			return "商品: " + name + " ,支付成功 余额:" + subtract;
		} else {
			return "余额不足";
		}
	}


	/**
	 * 查询余额
	 *
	 * @return BigDecimal
	 */
	public abstract BigDecimal query();


}
