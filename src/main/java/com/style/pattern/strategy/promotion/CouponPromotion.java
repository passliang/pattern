package com.style.pattern.strategy.promotion;

/**
 * @author leon
 * @date 2021-04-12 21:53:53
 */
public class CouponPromotion implements IPromotion {
	@Override
	public void settle() {
		System.out.println("优惠券");
	}
}
