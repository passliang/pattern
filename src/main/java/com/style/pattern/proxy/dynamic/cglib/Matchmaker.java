package com.style.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 媒婆代理
 *
 * @author leon
 * @date 2021-04-25 13:58:45
 */
public class Matchmaker implements MethodInterceptor {

	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("媒婆开始物色");
		//注意一定是invokeSuper 而不是invoke
		Object invoke = methodProxy.invokeSuper(obj, objects);
		System.out.println("满意,开始交往");
		return invoke;
	}
}
