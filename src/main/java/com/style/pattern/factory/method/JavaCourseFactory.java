package com.style.pattern.factory.method;

import com.style.pattern.factory.Course;
import com.style.pattern.factory.JavaCourse;

/**
 * @author leon
 * @date 2021-04-27 15:23:09
 */
public class JavaCourseFactory implements CourseFactory {

	@Override
	public Course create() {
		return new JavaCourse();
	}
}
