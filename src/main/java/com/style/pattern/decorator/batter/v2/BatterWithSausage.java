package com.style.pattern.decorator.batter.v2;

/**
 * @author leon
 * @date 2021-04-08 21:49:05
 */
public class BatterWithSausage {

	private final Batter batter;

	public BatterWithSausage(Batter batter) {
		this.batter = batter;
	}

	public String getName() {
		return batter.getName() + "加香肠";
	}

	public Integer getPrice() {
		return batter.getPrice() + 2;
	}

}
