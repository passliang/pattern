package com.style.pattern.decorator.batter.v1;

/**
 * @author leon
 * @date 2021-04-08 21:43:21
 */
public class Test {
	public static void main(String[] args) {
		Batter batter = new Batter();
		System.out.println(batter.getName() + "价格:" + batter.getPrize());
		BatterWithEgg batterWithEgg = new BatterWithEgg();
		System.out.println(batterWithEgg.getName() + "价格:" + batterWithEgg.getPrize());
		BatterWithEggAndSausage batterWithEggAndSausage = new BatterWithEggAndSausage();
		System.out.println(batterWithEggAndSausage.getName() + "价格:" + batterWithEggAndSausage.getPrize());
		//在加两个鸡蛋 两个香肠 得重新添加新的实现 不方便扩展
	}
}
