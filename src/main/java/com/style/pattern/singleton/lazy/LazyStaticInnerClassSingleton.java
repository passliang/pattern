package com.style.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 懒汉式单例 内部静态类
 * <p>
 * 优点 利用了Java自带特性 避免内存浪费 不容易被反射破坏
 * 缺点 不优雅
 * </p>
 *
 * @author leon
 * @date 2021-04-26 22:38:58
 */
@SuppressWarnings("all")
public class LazyStaticInnerClassSingleton {

	public static LazyStaticInnerClassSingleton getInstance() {
		return LazyStaticInnerClassSingletonHolder.lazyInnerClassSingleton;
	}

	private static class LazyStaticInnerClassSingletonHolder {
		private static LazyStaticInnerClassSingleton lazyInnerClassSingleton = new LazyStaticInnerClassSingleton();
	}

	private LazyStaticInnerClassSingleton() {
		//增加判断 防止被反射破坏
		if (LazyStaticInnerClassSingletonHolder.lazyInnerClassSingleton != null) {
			throw new RuntimeException("不允许创建多个实例");
		}
	}

	public static void main(String[] args) {
		try {
			Class<LazyStaticInnerClassSingleton> lazyInnerClassSingletonClass = LazyStaticInnerClassSingleton.class;
			Constructor<LazyStaticInnerClassSingleton> constructor = lazyInnerClassSingletonClass.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			LazyStaticInnerClassSingleton lazyInnerClassSingleton = constructor.newInstance();
			LazyStaticInnerClassSingleton lazyInnerClassSingleton1 = constructor.newInstance();
			System.out.println("lazyInnerClassSingleton: " + lazyInnerClassSingleton);
			System.out.println("lazyInnerClassSingleton1: " + lazyInnerClassSingleton1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
