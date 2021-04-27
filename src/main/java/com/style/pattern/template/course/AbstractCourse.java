package com.style.pattern.template.course;

/**
 * @author leon
 * @date 2021-04-10 22:51:39
 */
public abstract class AbstractCourse {

	public void publish() {
		prepareCourse();
		livingVideo();
		uploadVideo();
		uploadCourseware();
		assignHomeWork();
		if (needCheckHomeWork()) {
			checkHomeWork();
		}
	}

	/**
	 * 是否需要检查作业
	 *
	 * @return Boolean
	 */
	protected abstract Boolean needCheckHomeWork();


	private void checkHomeWork() {
		System.out.println("检查作业");
	}

	private void assignHomeWork() {
		System.out.println("分配作业");
	}

	private void uploadCourseware() {
		System.out.println("上传课件");
	}

	private void uploadVideo() {
		System.out.println("上传视频");
	}

	private void livingVideo() {
		System.out.println("直播课程");
	}

	private void prepareCourse() {
		System.out.println("备课");
	}
}
