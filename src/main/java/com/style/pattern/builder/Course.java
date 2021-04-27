package com.style.pattern.builder;

import lombok.Data;

/**
 * @author leon
 * @date 2021-04-26 22:15:39
 */
@Data
public class Course {
	private String name;
	private String ppt;
	private String video;
	private String homework;

	@Override
	public String toString() {
		return "Course{" +
				"name='" + name + '\'' +
				", ppt='" + ppt + '\'' +
				", video='" + video + '\'' +
				", homework='" + homework + '\'' +
				'}';
	}
}
