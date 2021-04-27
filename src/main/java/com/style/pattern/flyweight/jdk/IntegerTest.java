package com.style.pattern.flyweight.jdk;

/**
 * @author leon
 * @date 2021-04-06 21:32:33
 */
@SuppressWarnings("all")
public class IntegerTest {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(100);
		Integer b = 100;
		System.out.println(a == b);

		Integer c = Integer.valueOf(1000);
		Integer d = 1000;
		System.out.println(c == d);

	}
}
