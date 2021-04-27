package com.style.pattern.composite.folder;

/**
 * @author leon
 * @date 2021-04-07 21:27:14
 */
public abstract class Directory {
	protected String name;

	public Directory(String name) {
		this.name = name;
	}

	public abstract void show();
}
