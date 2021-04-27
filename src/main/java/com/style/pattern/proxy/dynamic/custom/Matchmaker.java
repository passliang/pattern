package com.style.pattern.proxy.dynamic.custom;

import com.style.pattern.proxy.IPerson;
import com.style.pattern.proxy.dynamic.custom.core.CustomClassLoader;
import com.style.pattern.proxy.dynamic.custom.core.CustomInvocationHandler;
import com.style.pattern.proxy.dynamic.custom.core.CustomProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒婆代理
 *
 * @author leon
 * @date 2021-04-25 13:58:45
 */
public class Matchmaker implements CustomInvocationHandler {

	private IPerson target;

	public IPerson getInstance(IPerson target) {
		this.target = target;
		try {
			return (IPerson) CustomProxy.newProxyInstance(new CustomClassLoader(), target.getClass().getInterfaces(), this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null ;
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
