package com.style.pattern.decorator.batter.v3;

/**
 * @author leon
 * @date 2021-04-08 21:49:05
 */
public class BatterWithEgg extends BaseBatter {

	private final Batter batter;

	public BatterWithEgg(Batter batter) {
		this.batter = batter;
	}

	@Override
	public String getName() {
		return batter.getName() + "加鸡蛋";
	}

	@Override
	public Integer getPrice() {
		return batter.getPrice() + 1;
	}

}
