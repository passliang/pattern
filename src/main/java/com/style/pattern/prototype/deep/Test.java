package com.style.pattern.prototype.deep;

import com.style.pattern.prototype.deep.Member;

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
		member.setSex(2);
		ArrayList<String> hobbies = new ArrayList<>();
		hobbies.add("code");
		hobbies.add("look-book");
		member.setHobbies(hobbies);

		Member clone = (Member) member.deepHobbiesClone();
		clone.getHobbies().add("games2");
		System.out.println("member:"+member);
		System.out.println("clone member:"+clone);
		System.out.println("member 与 clone member :"+ (member == clone));
		System.out.println("member getHobbies 与 clone member getHobbies :"+ (member.getHobbies() == clone.getHobbies()));
		//member:Member{name='Leon', sex=2, hobbies=[code, look-book]}
		//clone member:Member{name='Leon', sex=2, hobbies=[code, look-book, games2]}
		//member 与 clone member :false
		//member getHobbies 与 clone member getHobbies :false

		//源码
		// ArrayList clone()  实现深克隆
		// hashmap clone() 实现深克隆
		//优点
		//性能优良 Java自带的原型模式 是基于内存二进制流的拷贝 比直接new一个对象提升了很多
		//可以使用深克隆来保存对象状态 使用原型模式将对象复制一份并将其状态保存起来 简化创建过程
		//缺点
		// 必须具备克隆方法(或可拷贝方法)
		// 当对已经类进行改造 需要修改代码 违反了 开闭原则
		// 深克隆浅克隆需要运用得当


	}
}
