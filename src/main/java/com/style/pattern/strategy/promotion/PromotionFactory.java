package com.style.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon
 * @date 2021-04-12 21:53:53
 */
public class PromotionFactory {


	private static final Map<String, IPromotion> PROMOTION_MAP = new HashMap<>();

	static {
		PROMOTION_MAP.put(PromotionKey.GROUP_BUY, new GroupBuyPromotion());
		PROMOTION_MAP.put(PromotionKey.COUPON, new GroupBuyPromotion());
		PROMOTION_MAP.put(PromotionKey.DEFAULT, new NonePromotion());
	}


	private PromotionFactory() {
	}


	public static String getPromotionKey() {
		return PromotionKey.GROUP_BUY;
	}

	public static IPromotion getPromotion(String key) {

		if (PROMOTION_MAP.containsKey(key)) {
			return PROMOTION_MAP.get(key);
		}
		return PROMOTION_MAP.get(PromotionKey.DEFAULT);
	}


	public interface PromotionKey {
		String GROUP_BUY = "groupBuy";
		String COUPON = "coupon";
		String DEFAULT = "default";
	}

}
