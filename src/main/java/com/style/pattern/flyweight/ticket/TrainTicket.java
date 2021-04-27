package com.style.pattern.flyweight.ticket;

import java.util.Random;

/**
 * @author leon
 * @date 2021-04-06 21:11:02
 */
public class TrainTicket implements ITicket {
	private String from;
	private String to;

	private Integer prize;

	public TrainTicket(String from, String to) {
		this.from = from;
		this.to = to;
		prize = new Random().nextInt(1000);
	}

	@Override
	public void showInfo(String bunk) {
		System.out.println("从" + from + "到" + to + " 席位:" + bunk + " 价格:" + prize);
	}
}
