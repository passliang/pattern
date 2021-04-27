package com.style.pattern.composite.folder;

/**
 * @author leon
 * @date 2021-04-07 21:33:03
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("============safe===============");
		Folder folder = new Folder("D盘", 1);

		Folder note = new Folder("笔记", 1);
		Folder video = new Folder("视频", 1);

		Folder source = new Folder("源码", 2);
		//安全型组合模式 虽然都是Directory 但是 添加权限不同 更为安全
		//人和猴子都是动物 人会使用工具 猴子不会
		File spring = new File("spring");
		File mybatis = new File("mybatis");
		File zookeeper = new File("zookeeper");
		source.addFile(spring);
		source.addFile(mybatis);
		source.addFile(zookeeper);

		folder.addFile(note);
		folder.addFile(video);
		folder.addFile(source);

		folder.show();
	}
}
