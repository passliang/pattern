package com.style.pattern.factory.abstractfactory;

/**
 * @author leon
 * @date 2021-04-27 16:23:57
 */
public class JavaVideo implements IVideo{
	/**
	 * 录制视频
	 */
	@Override
	public void record(){
		System.out.println("java 视频 ");
	}
}
