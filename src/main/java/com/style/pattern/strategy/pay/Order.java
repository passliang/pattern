package com.style.pattern.strategy.pay;

import com.style.pattern.strategy.pay.payport.PayStrategy;
import com.style.pattern.strategy.pay.payport.Payment;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-12 22:23:14
 */
public class Order {
	private final String name;

	private final BigDecimal price;

	public Order(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String pay(String key) {
		Payment payment = PayStrategy.getPayment(key);
		return payment.pay(this.name, this.price, payment);
	}
}
