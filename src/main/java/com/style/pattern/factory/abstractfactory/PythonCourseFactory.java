package com.style.pattern.factory.abstractfactory;

/**
 * @author leon
 * @date 2021-04-27 16:27:42
 */
public class PythonCourseFactory extends AbstractCourseFactory {

	@Override
	public IVideo createVideo() {
		return new PythonVideo();
	}

	@Override
	public INote createNote() {
		return new PythonNote();
	}
}
