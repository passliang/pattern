package com.style.pattern.proxy.dynamic.custom.core;

import java.lang.reflect.Method;

/**
 * @author leon
 * @date 2021-04-26 10:13:48
 */
public interface CustomInvocationHandler {
	/**
	 * 调用
	 *
	 * @param proxy proxy
	 * @param  method method
	 * @param args args
	 * @return Object
	 * @throws Throwable
	 */
	Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;
}
