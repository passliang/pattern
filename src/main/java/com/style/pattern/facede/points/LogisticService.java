package com.style.pattern.facede.points;

/**
 * @author leon
 * @date 2021-04-08 20:56:20
 */
public class LogisticService {
	public void send(GiftInfo giftInfo){
		String name = giftInfo.getName();
		System.out.println("积分礼物:"+name +"发货了");
	}
}
