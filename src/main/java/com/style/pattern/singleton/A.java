package com.style.pattern.singleton;

/**
 * @author leon
 * @date 2021-04-26 22:34:31
 */
public class A {
	//源码中应用
	//spring abstractFactoryBean org.springframework.beans.factory.config.AbstractFactoryBean.getObject
	//mybatis ErrorContext  org.apache.ibatis.executor.ErrorContext.instance

	//优点
	//1.内存中只有一个实例对象 减少内存开销
	//2.可以避免对资源多重占用
	//3.设置全局访问点 严格控制访问
	//缺点
	//1.没有接口 扩展困难
	//2.如果要扩展单例对象 只能修改代码 没有其他途径
}
