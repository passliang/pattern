package com.style.pattern.factory.abstractfactory;

/**
 * @author leon
 * @date 2021-04-27 16:27:42
 */
public class JavaCourseFactory extends AbstractCourseFactory {

	@Override
	public IVideo createVideo() {
		return new JavaVideo();
	}

	@Override
	public INote createNote() {
		return new JavaNote();
	}
}
