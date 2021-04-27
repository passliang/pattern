package com.style.pattern.visitor.dispater.stat;

/**
 * @author leon
 * @date 2021-04-23 16:26:18
 */
public class Main {

	public void test(String path) {
		System.out.println("path: " + path);
	}

	public void test(Integer path) {
		System.out.println("path:" + path);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.test("啊哈");
		main.test(1);
	}
}
