package com.style.pattern.factory.abstractfactory;

/**
 * @author leon
 * @date 2021-04-27 16:27:42
 */
public abstract class AbstractCourseFactory {

	/**
	 * 创建视频
	 *
	 * @return IVideo
	 */
	abstract IVideo createVideo();
	/**
	 * 创建笔记
	 *
	 * @return INote
	 */
	abstract INote createNote();
}
