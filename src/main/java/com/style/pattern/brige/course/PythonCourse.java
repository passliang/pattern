package com.style.pattern.brige.course;

/**
 * @author leon
 * @date 2021-04-03 23:30:25
 */
public class PythonCourse extends AbstractCourse {
	@Override
	public void study() {
		System.out.println("学习Python");
		video.record();
		note.edit();
	}
}
