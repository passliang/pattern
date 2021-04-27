package com.style.pattern.factory.simple;

import com.style.pattern.factory.Course;
import com.style.pattern.factory.JavaCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leon
 * @date 2021-04-27 15:26:53
 */
public class Test {
	private static final Logger logger = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args){

		Course course = CourseFactory.create(JavaCourse.class);
		course.record();
		//sl4j loggerFactory

		//优点
		//1. 传入正确的参数就可以获取你所需对象 无须知道创建细节
		//缺点
		//1. 工厂类职责相对过重 增加新的产品需要修改工厂类对应创建逻辑 违背开闭原则
		//2. 不易于扩展过于复杂的产品结构
		logger.info("1111");
	}
}
