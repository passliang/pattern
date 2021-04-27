package com.style.pattern.brige.course;

/**
 * @author leon
 * @date 2021-04-03 23:31:24
 */
public class PythonNote implements INote{
	@Override
	public void edit() {
		System.out.println("记录python 笔记");
	}
}
