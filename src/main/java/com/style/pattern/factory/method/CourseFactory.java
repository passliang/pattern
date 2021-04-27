package com.style.pattern.factory.method;

import com.style.pattern.factory.Course;

/**
 * @author leon
 * @date 2021-04-27 15:23:09
 */
public interface CourseFactory {
	/**
	 * 创建
	 *
	 * @return Course
	 */
	Course create();
}
