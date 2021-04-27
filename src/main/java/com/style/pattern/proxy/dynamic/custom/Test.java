package com.style.pattern.proxy.dynamic.custom;

import com.style.pattern.proxy.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author leon
 * @date 2021-04-25 14:08:29
 */
public class Test {
	public static void main(String[] args) {
		//cglib 采用继承方式 覆盖父类的方法
		//jdk 采用实现方式 要求代理的类一定要实现接口
		//都是通过生成字节码  重组为新的类

		//jdk proxy 对于用户而言 依赖更强 调用也更为复杂
		//CGlib 对代理的类没有任何要求
		///cglib 效率更高 性能也更高  底层没有用到反射
		//jdk 生成过程简单 执行效率低 每次都要用到反射

		//cglib 坑 目标代理类不能有final的方法 忽略带final修饰的方法
 		Matchmaker matchmaker = new Matchmaker();
		//张三
		IPerson zhangSan = matchmaker.getInstance(new ZhangSan());
		zhangSan.findLove();
		System.out.println("=========================");
	}
}
