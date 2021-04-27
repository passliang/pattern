package com.style.pattern.brige.course;

/**
 * @author leon
 * @date 2021-04-03 23:47:04
 */
public class Test {
	public static void main(String[] args) {
		AbstractCourse java = new JavaCourse();
		java.setNote(new JavaNote());
		java.setVideo(new JavaVideo());
		java.study();
		System.out.println("=============================");
		AbstractCourse python = new PythonCourse();
		python.setNote(new PythonNote());
		python.setVideo(new PythonVideo());
		python.study();
	}
}
