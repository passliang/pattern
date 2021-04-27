package com.style.pattern.factory.abstractfactory;

/**
 * @author leon
 * @date 2021-04-27 16:30:23
 */
public class Test {
	public static void main(String[] args) {
		AbstractCourseFactory factory = new JavaCourseFactory();
		IVideo video = factory.createVideo();
		video.record();
		INote note = factory.createNote();
		note.edit();

		//优点
		//1. 具体产品在应用层代码隔离 无须关心创建细节
		//2. 将一系列产品族统一创建
		//缺点
		//1. 规定了所有可能被创建产品的集合 产品组扩展新的产品困难 需要修改抽象工厂接口
		//2. 增加了系统的抽象性和理解难度

	}
}
