package com.style.pattern.decorator.batter.v3;

/**
 * @author leon
 * @date 2021-04-08 21:49:05
 */
public class BaseBatter extends Batter {

	@Override
	public String getName() {
		return "原味煎饼";
	}

	@Override
	public Integer getPrice() {
		return 5;
	}

}
