package com.style.pattern.singleton.lazy;

/**
 * 懒汉式单例 加锁
 * <p>
 * 优点 节省内存 线程安全
 * 缺点 多线程竞争可能抢锁太频繁
 * </p>
 *
 * @author leon
 * @date 2021-04-26 22:38:58
 */
@SuppressWarnings("all")
public class LazySychornizedSingleton {

	private static LazySychornizedSingleton LazySingleton = null;

	public static synchronized LazySychornizedSingleton getInstance() {
		if (LazySingleton == null) {
			LazySingleton = new LazySychornizedSingleton();
		}
		return LazySingleton;
	}


	private LazySychornizedSingleton() {

	}


	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			LazySychornizedSingleton instance = getInstance();
			System.out.println("thread1 instance: " + instance);
		});
		Thread thread2 = new Thread(() -> {
			LazySychornizedSingleton instance = getInstance();
			System.out.println("thread2 instance: " + instance);
		});

		thread1.start();
		thread2.start();
	}
}
