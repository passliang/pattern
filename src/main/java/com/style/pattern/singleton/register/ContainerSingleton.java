package com.style.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author leon
 * @date 2021-04-27 10:15:12
 */
public class ContainerSingleton {

	private static final Map<String, Object> CONTAINER = new ConcurrentHashMap<>();

	public static Object getInstance(String className) {
		if (!CONTAINER.containsKey(className)) {

			try {
				Class<?> aClass = Class.forName(className);
				Object o = aClass.newInstance();
				CONTAINER.put(className, o);
				return o;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return CONTAINER.get(className);
	}

	private ContainerSingleton() {
	}

	public static void main(String[] args) {
		System.out.println("instance1"+ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
		System.out.println("instance2"+ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
	}
}
