package com.style.pattern.composite.course;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-06 22:14:33
 */
public class CoursePackage extends CourseComponent {
	private final Integer level;

	private final List<CourseComponent> courseComponentList;

	public CoursePackage(String name, BigDecimal price, Integer level) {
		super(name, price);
		this.level = level;
		courseComponentList = new ArrayList<>();
	}

	@Override
	public void addCourse(CourseComponent courseComponent) {
		this.courseComponentList.add(courseComponent);
	}

	@Override
	public void removeCourse(CourseComponent courseComponent) {
		this.courseComponentList.remove(courseComponent);
	}

	@Override
	public void show() {
		System.out.println(this.name);
		for (CourseComponent courseComponent : courseComponentList) {
			if (null != this.level) {
				for (int i = 0; i < this.level; i++) {
					System.out.print("  ");
				}
				for (int i = 0; i < this.level; i++) {
					if (i == 0) {
						System.out.print("+");
					}
					System.out.print("-");
				}
			}
			courseComponent.show();
		}
	}

}

