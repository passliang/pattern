package com.style.pattern.proxy.dynamic.jdk;

import com.style.pattern.proxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒婆代理
 *
 * @author leon
 * @date 2021-04-25 13:58:45
 */
public class Matchmaker implements InvocationHandler {

	private IPerson target;

	public IPerson getInstance(IPerson target) {
		this.target = target;
		ClassLoader classLoader = this.target.getClass().getClassLoader();
		return (IPerson) Proxy.newProxyInstance(classLoader, target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("媒婆开始物色");
		Object invoke = method.invoke(target, args);
		String name = target.getClass().getSimpleName();
		System.out.println(name + "满意,开始交往");
		return invoke;
	}
}
