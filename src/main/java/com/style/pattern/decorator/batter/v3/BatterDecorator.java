package com.style.pattern.decorator.batter.v3;

/**
 * @author leon
 * @date 2021-04-08 22:05:10
 */
public class BatterDecorator extends BaseBatter {

	private final Batter batter;

	public BatterDecorator(Batter batter) {
		this.batter = batter;
	}

	@Override
	public String getName() {
		return batter.getName();
	}

	@Override
	public Integer getPrice() {
		return batter.getPrice();
	}
}
