package com.style.pattern.decorator.batter.v1;

/**
 * @author leon
 * @date 2021-04-08 21:28:54
 */
public class BatterWithEgg extends Batter {

	@Override
	public String getName() {
		return super.getName() + "添加鸡蛋";
	}

	@Override
	public int getPrize() {
		return super.getPrize() + 1;
	}

}
