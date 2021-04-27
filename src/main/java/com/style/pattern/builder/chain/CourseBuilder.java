package com.style.pattern.builder.chain;

import com.style.pattern.builder.Course;

/**
 * @author leon
 * @date 2021-04-26 22:17:03
 */
public class CourseBuilder {

	private Course course = new Course();

	public Course build() {
		return course;
	}

	public CourseBuilder setName(String name) {
		this.course.setName(name);
		return this;
	}

	public CourseBuilder setPpt(String ppt) {
		this.course.setPpt(ppt);
		return this;
	}

	public CourseBuilder setHomework(String homework) {
		this.course.setHomework(homework);
		return this;
	}

	public CourseBuilder setVideo(String video) {
		this.course.setVideo(video);
		return this;
	}
}
