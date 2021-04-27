package com.style.pattern.composite.folder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-07 21:29:14
 */
public class Folder extends Directory {

	private Integer level;

	private List<Directory> files;

	public Folder(String name, Integer level) {
		super(name);
		this.level = level;
		files = new ArrayList<>();
	}

	public void addFile(Directory directory) {
		this.files.add(directory);
	}

	public void removeFile(File file) {
		this.files.remove(file);
	}

	@Override
	public void show() {
		System.out.println(this.name);
		for (Directory file : files) {
			for (int i = 0; i < level; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < level; i++) {
				if (i == 0) {
					System.out.print("+");
				}
				System.out.print("-");
			}
			file.show();
		}
	}
}
