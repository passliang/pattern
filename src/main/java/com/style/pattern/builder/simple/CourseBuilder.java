package com.style.pattern.builder.simple;

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

	public void setName(String name) {
		this.course.setName(name);
	}

	public void setPpt(String ppt) {
		this.course.setPpt(ppt);
	}

	public void setHomework(String homework) {
		this.course.setHomework(homework);
	}

	public void setVideo(String video) {
		this.course.setVideo(video);
	}
}
