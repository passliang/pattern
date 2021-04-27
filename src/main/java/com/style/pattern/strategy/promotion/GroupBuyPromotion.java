package com.style.pattern.strategy.promotion;

/**
 * @author leon
 * @date 2021-04-12 21:53:53
 */
public class GroupBuyPromotion implements IPromotion {
	@Override
	public void settle() {
		System.out.println("拼团");
	}
}
