package com.style.pattern.factory.method;

import com.style.pattern.factory.AiCourse;
import com.style.pattern.factory.Course;

/**
 * @author leon
 * @date 2021-04-27 15:23:09
 */
public class AiCourseFactory implements CourseFactory {

	@Override
	public Course create() {
		return new AiCourse();
	}
}
