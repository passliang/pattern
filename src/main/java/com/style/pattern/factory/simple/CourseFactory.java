package com.style.pattern.factory.simple;

import com.style.pattern.factory.AiCourse;
import com.style.pattern.factory.Course;
import com.style.pattern.factory.JavaCourse;
import com.style.pattern.factory.PythonCourse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon
 * @date 2021-04-27 15:23:09
 */
public class CourseFactory {

	private static final Map<String, Course> COURSE_MAP = new HashMap<>();

	static {
		COURSE_MAP.put(JavaCourse.class.getName(), new JavaCourse());
		COURSE_MAP.put(PythonCourse.class.getName(), new PythonCourse());
		COURSE_MAP.put(AiCourse.class.getName(), new AiCourse());
	}

	public static Course create(Class<? extends Course> course) {
		if (COURSE_MAP.containsKey(course.getName())) {
			return COURSE_MAP.get(course.getName());
		}
		//默认返回 Java
		return COURSE_MAP.get(JavaCourse.class.getName());
	}
}
