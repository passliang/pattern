package com.style.pattern.builder.chain;

import com.style.pattern.builder.Course;

/**
 * @author leon
 * @date 2021-04-26 22:20:06
 */
public class Test {
	public static void main(String[] args) {
		CourseBuilder courseBuilder = new CourseBuilder()
				.setName("建造者模式")
				.setPpt("稍后上传")
				.setVideo("建造者模式.mp4")
				.setHomework("无");
		Course build = courseBuilder.build();
		System.out.println("build: " + build);

		//源码中
		//jdk stringBuilder append
		//mybatis cacheBuilder sqlSessionFactoryBuilder
		//spring beanDefinitionBuilder

		//优点
		//封装性好 创建和使用分离
		//扩展性好 建造者类之间独立 一定程度上解耦
		//缺点
		//产生多余builder对象
		//产品内部修改 建造者都需要修改 成本较大
	}
}
