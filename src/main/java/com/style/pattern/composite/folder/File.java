package com.style.pattern.composite.folder;

/**
 * @author leon
 * @date 2021-04-07 21:28:18
 */
public class File extends Directory {

	public File(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println(this.name);
	}
}
