package com.style.pattern.facede.points;

/**
 * @author leon
 * @date 2021-04-08 20:52:10
 */
public class PointsService {

	/**
	 * 扣除积分
	 *
	 * @param giftInfo giftInfo
	 * @return Boolean
	 */
	public Boolean deducePoints(GiftInfo giftInfo) {
		String name = giftInfo.getName();
		System.out.println(name + "扣除积分 ");
		return true;
	}
}
