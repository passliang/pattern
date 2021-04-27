package com.style.pattern.builder.simple;

import com.style.pattern.builder.Course;

/**
 * @author leon
 * @date 2021-04-26 22:20:06
 */
public class Test {
	public static void main(String[] args) {
		CourseBuilder courseBuilder = new CourseBuilder();
		courseBuilder.setName("建造者模式");
		courseBuilder.setPpt("稍后上传");
		courseBuilder.setVideo("建造者模式.mp4");
		courseBuilder.setHomework("无");
		Course build = courseBuilder.build();
		System.out.println("build: " + build);
	}
}
