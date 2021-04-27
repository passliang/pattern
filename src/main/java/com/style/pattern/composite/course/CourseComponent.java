package com.style.pattern.composite.course;

import javax.xml.bind.PrintConversionEvent;
import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-06 22:09:52
 */

public abstract class CourseComponent {

	protected String name;

	protected BigDecimal price;

	public CourseComponent(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}


	public abstract void addCourse(CourseComponent courseComponent);

	public abstract void removeCourse(CourseComponent courseComponent);

	public abstract void show();
}
