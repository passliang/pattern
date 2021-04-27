package com.style.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-26 21:33:19
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Member member = new Member();
		member.setName("Leon");
		member.setSex(1);
		List<String> hobbies = new ArrayList<>();
		hobbies.add("code");
		hobbies.add("look-book");
		member.setHobbies(hobbies);

		Member clone = (Member) member.clone();
		clone.getHobbies().add("games");
		System.out.println("member:"+member);
		System.out.println("clone member:"+clone);
		System.out.println("member 与 clone member :"+ (member == clone));
		System.out.println("member getHobbies 与 clone member getHobbies :"+ (member.getHobbies() == clone.getHobbies()));
	}
}
