package com.style.pattern.singleton.threadlocal;

/**
 * @author leon
 * @date 2021-04-27 10:41:02
 */
public class ThreadLocalSingleton {

	private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalSingleton::new);

	public static ThreadLocalSingleton getInstance() {
		return THREAD_LOCAL.get();
	}

	private ThreadLocalSingleton() {
	}

	@SuppressWarnings("all")
	public static void main(String[] args) {
		System.out.println("instance1: " + ThreadLocalSingleton.getInstance());
		System.out.println("instance2: " + ThreadLocalSingleton.getInstance());
		System.out.println("instance3: " + ThreadLocalSingleton.getInstance());

		new Thread(()->{
			System.out.println("Thread1: " + ThreadLocalSingleton.getInstance());
			System.out.println("Thread2: " + ThreadLocalSingleton.getInstance());
		}).start();

		new Thread(()->{
			System.out.println("Thread3: " + ThreadLocalSingleton.getInstance());
			System.out.println("Thread4: " + ThreadLocalSingleton.getInstance());
		}).start();
	}

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
