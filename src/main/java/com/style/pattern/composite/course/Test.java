package com.style.pattern.composite.course;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-06 22:49:21
 */
public class Test {
	public static void main(String[] args) {
		CourseComponent java = new CoursePackage("java架构师", BigDecimal.valueOf(6290.00), 2);
		CourseComponent distribute = new Course("分布式", BigDecimal.valueOf(2290.00));
		CourseComponent source = new Course("源码分析", BigDecimal.valueOf(1290.00));
		CourseComponent jvm = new Course("JVM进阶", BigDecimal.valueOf(3290.00));
		java.addCourse(distribute);
		java.addCourse(source);
		java.addCourse(jvm);


		CourseComponent mainDirect = new CoursePackage("课程目录", BigDecimal.valueOf(16290.00), 1);

		CourseComponent python = new CoursePackage("python", BigDecimal.valueOf(16290.00), 1);
		CourseComponent ai = new CoursePackage("AI", BigDecimal.valueOf(62290.00), 1);

		mainDirect.addCourse(python);
		mainDirect.addCourse(ai);
		mainDirect.addCourse(java);
		mainDirect.show();
		System.out.println("===========一节===========");
	}
}
