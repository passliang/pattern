package com.style.pattern.factory.method;

import com.style.pattern.factory.Course;
import com.style.pattern.factory.JavaCourse;
import com.style.pattern.factory.PythonCourse;

/**
 * @author leon
 * @date 2021-04-27 15:23:09
 */
public class PythonCourseFactory implements CourseFactory {

	@Override
	public Course create() {
		return new PythonCourse();
	}
}
