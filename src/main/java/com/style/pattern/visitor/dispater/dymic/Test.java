package com.style.pattern.visitor.dispater.dymic;

/**
 * @author leon
 * @date 2021-04-23 16:54:42
 */
public class Test {
	public static void main(String[] args) {
		Person man = new Man();
		Person woman = new WoMan();
		man.role();
		woman.role();
	}
}
