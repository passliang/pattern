package com.style.pattern.facede.points;

/**
 * @author leon
 * @date 2021-04-08 20:50:43
 */
public class FacdeSevice {

	StockService stockService = new StockService();
	PointsService pointsService = new PointsService();
	LogisticService logisticService = new LogisticService();

	public String exchange(GiftInfo giftInfo) {
		String name = giftInfo.getName();
		Boolean validateStock = stockService.validateStock(giftInfo);
		if (validateStock) {
			Boolean deducePoints = pointsService.deducePoints(giftInfo);
			if (deducePoints) {
				logisticService.send(giftInfo);
			}
		}
		return name + "兑换成功";
	}
}
