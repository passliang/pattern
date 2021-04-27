package com.style.pattern.decorator.batter.v1;

/**
 * @author leon
 * @date 2021-04-08 21:28:54
 */
public class BatterWithEggAndSausage extends BatterWithEgg {

	@Override
	public String getName() {
		return super.getName() + "加香肠鸡蛋";
	}

	@Override
	public int getPrize() {
		return super.getPrize() + 2;
	}

}
