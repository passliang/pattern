package com.style.pattern.singleton.hungry;

/**
 * @author leon
 * @date 2021-04-26 22:35:57
 */
public class HungryStaticSingleton {
	//先静态后动态
	//先上后下
	//先属性后方法
	/**
	 * HUNGRY_SINGLETON
	 */
	private static HungryStaticSingleton HUNGRY_SINGLETON = null;

	static {
		HUNGRY_SINGLETON = new HungryStaticSingleton();
	}

	private HungryStaticSingleton() {
	}

	public static HungryStaticSingleton getInstance() {
		return HUNGRY_SINGLETON;
	}

}
