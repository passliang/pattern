package com.style.pattern.factory;

/**
 * @author leon
 * @date 2021-04-27 15:22:17
 */
public class PythonCourse implements Course {
	@Override
	public void record() {
		System.out.println("录制Python课程");
	}
}
