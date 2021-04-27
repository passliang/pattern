package com.style.pattern.singleton.register;

import java.lang.reflect.Constructor;

/**
 * 枚举式单例
 * 优点 不能被反射破坏
 * 缺点 如果有大量对象创建 浪费内存
 * @author leon
 * @date 2021-04-27 10:06:23
 */
public enum EnumSingleTon {
	/**
	 * 对象实例
	 */
	INSTANCE;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static EnumSingleTon getInstance() {
		return INSTANCE;
	}


	public static void main(String[] args) {
		System.out.println("instance1: " + EnumSingleTon.getInstance());
		System.out.println("instance2: " + EnumSingleTon.getInstance());

		try {
			Class<EnumSingleTon> enumSingleTonClass = EnumSingleTon.class;
			Constructor<EnumSingleTon> constructor = enumSingleTonClass.getDeclaredConstructor(String.class, int.class);
			constructor.setAccessible(true);
			EnumSingleTon enumSingleTon = constructor.newInstance("1", 1);
			System.out.println("enumSingleTon: " + enumSingleTon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
