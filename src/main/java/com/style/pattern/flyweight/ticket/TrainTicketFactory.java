package com.style.pattern.flyweight.ticket;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * <p>
 * 优点: 减少对象创建 减少内存中对象数量 降低系统内存 提交效率 减少内存之外资源占用(连接池)
 * 缺点: 关注内外对象的变化 线程安全问题 使用系统 程序逻辑复杂化
 *
 * @author leon
 * @date 2021-04-06 21:14:26
 */
public class TrainTicketFactory {

	private static final Map<String, TrainTicket> trainTicketMap = new HashMap<>();

	public static void queryTicketInfo(String from, String to, String bunk) {
		String key = from + "->" + to;
		if (trainTicketMap.containsKey(key)) {
			System.out.println(key + "使用缓存");
			trainTicketMap.get(key).showInfo(bunk);
		} else {
			System.out.println(key + "首次查询");
			TrainTicket trainTicket = new TrainTicket(from, to);
			trainTicketMap.put(key, trainTicket);
			trainTicket.showInfo(bunk);
		}
	}
}
