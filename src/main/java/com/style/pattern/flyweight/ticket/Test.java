package com.style.pattern.flyweight.ticket;

/**
 * @author leon
 * @date 2021-04-06 21:19:26
 */
public class Test {
	public static void main(String[] args) {
		TrainTicketFactory.queryTicketInfo("杭州东", "太原南", "硬卧");
		TrainTicketFactory.queryTicketInfo("杭州东", "西藏东", "软卧¬");
		TrainTicketFactory.queryTicketInfo("杭州东", "太原南", "硬卧");
	}
}
