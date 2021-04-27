package com.style.pattern.decorator.batter.v2;

/**
 * @author leon
 * @date 2021-04-08 21:49:05
 */
public class BatterWithEgg {

	private final Batter batter;

	public BatterWithEgg(Batter batter) {
		this.batter = batter;
	}

	public String getName() {
		return batter.getName() + "加鸡蛋";
	}

	public Integer getPrice() {
		return batter.getPrice() + 1;
	}

}
