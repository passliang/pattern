package com.style.pattern.singleton.lazy;

/**
 * 懒汉式单例 双检锁
 * <p>
 * 优点 性能高了 线程安全
 * 缺点 可读性差 代码不够优雅
 * </p>
 *
 * @author leon
 * @date 2021-04-26 22:38:58
 */
@SuppressWarnings("all")
public class LazyDoubleCheckSingleton {

	private volatile static LazyDoubleCheckSingleton LazySingleton = null;

	public static LazyDoubleCheckSingleton getInstance() {
		if (LazySingleton == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (LazySingleton == null) {
					//重排序问题 添加 volatile
					LazySingleton = new LazyDoubleCheckSingleton();
				}
			}

		}
		return LazySingleton;
	}


	private LazyDoubleCheckSingleton() {

	}


	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			LazyDoubleCheckSingleton instance = getInstance();
			System.out.println("thread1 instance: " + instance);
		});
		Thread thread2 = new Thread(() -> {
			LazyDoubleCheckSingleton instance = getInstance();
			System.out.println("thread2 instance: " + instance);
		});

		thread1.start();
		thread2.start();
	}
}
