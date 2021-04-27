package com.style.pattern.brige.course;

/**
 * @author leon
 * @date 2021-04-03 23:32:25
 */
public class PythonVideo implements IVideo {
	@Override
	public void record() {
		System.out.println("观看Python视频");
	}
}
