package com.style.pattern.template.course;

/**
 * @author leon
 * @date 2021-04-11 14:55:25
 */
public class PythonCourse extends AbstractCourse {
	private boolean needCheckHomeWork;

	public void setNeedCheckHomeWork(boolean needCheckHomeWork) {
		this.needCheckHomeWork = needCheckHomeWork;
	}

	@Override
	protected Boolean needCheckHomeWork() {
		return needCheckHomeWork;
	}
}
