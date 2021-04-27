package com.style.pattern.factory.method;

import com.style.pattern.factory.Course;

/**
 * @author leon
 * @date 2021-04-27 16:04:16
 */
public class Test {
	public static void main(String[] args) {
		CourseFactory factory = new JavaCourseFactory();
		Course course = factory.create();
		course.record();
		//ILoggerFactory -> SubstituteLoggerFactory NOPLoggerFactory LoggerContext
		//优点
		//1. 只需要关注所需产品对应工厂 无须关心创建细节
		//2. 加入新的产品符合开闭原则 提高系统扩展性
		//缺点
		//1. 类的个数容易过多 增加了系统复杂度
		//2. 增加了系统抽象性和理解难度

	}
}
