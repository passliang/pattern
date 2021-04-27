package com.style.pattern.decorator.batter.v3;

/**
 * @author leon
 * @date 2021-04-08 21:54:48
 */
public class Test {
	public static void main(String[] args) {

		Batter batter = new BaseBatter();

		batter = new BatterWithEgg(batter);
		batter = new BatterWithEgg(batter);
		batter = new BatterWithSausage(batter);

		System.out.println(batter.getName() + "价格:" + batter.getPrice());


	}
}
