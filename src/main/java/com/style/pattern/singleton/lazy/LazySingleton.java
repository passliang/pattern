package com.style.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * <p>
 * 优点 节省内存
 * 缺点 线程不安全
 * </p>
 *
 * @author leon
 * @date 2021-04-26 22:38:58
 */
@SuppressWarnings("all")
public class LazySingleton {

	private static LazySingleton LazySingleton = null;

	public static LazySingleton getInstance() {
		if (LazySingleton == null) {
			LazySingleton = new LazySingleton();
		}
		return LazySingleton;
	}


	private LazySingleton() {

	}


	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			LazySingleton instance = getInstance();
			System.out.println("thread1 instance: " + instance);
		});
		Thread thread2 = new Thread(() -> {
			LazySingleton instance = getInstance();
			System.out.println("thread2 instance: " + instance);
		});

		thread1.start();
		thread2.start();

		//thread1 instance: com.style.pattern.singleton.lazy.LazySingleton@19b20db7
		//thread2 instance: com.style.pattern.singleton.lazy.LazySingleton@478899a9
	}
}
