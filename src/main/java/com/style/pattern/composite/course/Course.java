package com.style.pattern.composite.course;

import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-06 22:11:54
 */
public class Course extends CourseComponent {

	public Course(String name, BigDecimal price) {
		super(name, price);
	}

	@Override
	public void addCourse(CourseComponent courseComponent) {
		throw new RuntimeException("不允许添加课程");
	}

	@Override
	public void removeCourse(CourseComponent courseComponent) {
		throw new RuntimeException("不允许添加课程");
	}

	@Override
	public void show() {
		System.out.println(name + " (￥" + price + "元)");
	}
}
