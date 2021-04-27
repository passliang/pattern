package com.style.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * <p>
 * 优点 执行效率高 性能高 没有任何锁
 * 缺点 某些情况可能造成内存浪费
 *
 * @author leon
 * @date 2021-04-26 22:35:57
 */
public class HungrySingleton {
	private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return HUNGRY_SINGLETON;
	}

}
