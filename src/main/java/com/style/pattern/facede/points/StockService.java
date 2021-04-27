package com.style.pattern.facede.points;

/**
 * @author leon
 * @date 2021-04-08 20:51:26
 */
public class StockService {

	public Boolean validateStock(GiftInfo giftInfo) {
		String name = giftInfo.getName();
		System.out.println(name + "检查库存 ");
		return true;
	}
}
