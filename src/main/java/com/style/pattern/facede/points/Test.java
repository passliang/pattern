package com.style.pattern.facede.points;

/**
 * @author leon
 * @date 2021-04-08 21:00:52
 */
public class Test {
	public static void main(String[] args) {
		GiftInfo giftInfo = new GiftInfo("深入理解Java虚拟机");
		FacdeSevice facdeSevice = new FacdeSevice();
		facdeSevice.exchange(giftInfo);
	}
}
