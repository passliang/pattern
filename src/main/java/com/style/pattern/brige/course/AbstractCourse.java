package com.style.pattern.brige.course;

/**
 * @author leon
 * @date 2021-04-03 23:38:00
 */
public abstract class AbstractCourse implements ICourse {

	/**
	 * 视频引用
	 */
	protected IVideo video;
	/**
	 * 笔记引用
	 */
	protected INote note;

	public void setVideo(IVideo video) {
		this.video = video;
	}

	public void setNote(INote note) {
		this.note = note;
	}

	@Override
	public abstract void study();

	@Override
	public String toString() {
		return "AbstractCourse{" +
				"video=" + video +
				", note=" + note +
				'}';
	}
}
