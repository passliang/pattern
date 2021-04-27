package com.style.pattern.decorator.batter.v2;

/**
 * @author leon
 * @date 2021-04-08 21:54:48
 */
public class Test {
	public static void main(String[] args) {

		Batter batter = new BaseBatter();
		System.out.println(batter.getName()+"价格:"+batter.getPrice());

		BatterWithEgg batterWithEgg = new BatterWithEgg(batter);
		System.out.println(batterWithEgg.getName()+"价格:"+batterWithEgg.getPrice());
		batterWithEgg = new BatterWithEgg(batter);
		System.out.println(batterWithEgg.getName()+"价格:"+batterWithEgg.getPrice());

		BatterWithSausage batterWithEggAndSausage = new BatterWithSausage(batter);
		System.out.println(batterWithEggAndSausage.getName()+"价格:"+batterWithEggAndSausage.getPrice());


	}
}
