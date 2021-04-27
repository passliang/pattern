package com.style.pattern.flyweight.jdk;

/**
 * @author leon
 * @date 2021-04-06 21:23:22
 */
@SuppressWarnings("all")
public class StringTest {
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		String s3 = "he" + "llo";
		String s4 = "he" + new String("llo");
		String s5 = new String("hello");
		String s6 = s5.intern();
		String s7 = "h";
		String s8 = "ello";
		String s9 = s7 + s8;
		//true
		System.out.println(s1 == s2);
		//true
		System.out.println(s1 == s3);
		//false
		System.out.println(s1 == s4);
		//false
		System.out.println(s1 == s5);
		//true
		System.out.println(s1 == s6);
		//false
		System.out.println(s1 == s9);
	}
}
