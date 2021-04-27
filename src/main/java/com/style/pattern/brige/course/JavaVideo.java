package com.style.pattern.brige.course;

/**
 * @author leon
 * @date 2021-04-03 23:32:25
 */
public class JavaVideo implements IVideo{
	@Override
	public void record() {
		System.out.println("观看Java视频");
	}
}
