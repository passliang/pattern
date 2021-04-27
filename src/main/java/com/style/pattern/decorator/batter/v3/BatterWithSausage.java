package com.style.pattern.decorator.batter.v3;

/**
 * @author leon
 * @date 2021-04-08 21:49:05
 */
public class BatterWithSausage extends BatterDecorator {

	private final Batter batter;

	public BatterWithSausage(Batter batter) {
		super(batter);
		this.batter = batter;
	}

	@Override
	public String getName() {
		return batter.getName() + "加香肠";
	}

	@Override
	public Integer getPrice() {
		return batter.getPrice() + 2;
	}

}
