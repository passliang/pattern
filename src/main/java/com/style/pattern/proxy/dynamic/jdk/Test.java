package com.style.pattern.proxy.dynamic.jdk;

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
		Matchmaker matchmaker = new Matchmaker();
		//张三
		IPerson zhangSan = matchmaker.getInstance(new ZhangSan());
		zhangSan.findLove();
		System.out.println("=========================");
		//李四
		IPerson liSi = matchmaker.getInstance(new LiSi());
		liSi.findLove();

		byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy.class", new Class[]{IPerson.class});
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("/usr/local/develop/$Proxy.class");
			fis.write(bytes);
			fis.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		//优点
		//代理模式可以将代理对象与真实被调用的目标对象分离 一定程度降低了耦合性 易于扩展
		//代理对象可以保护目标对象
		//代理对象对目标对象增强
		//缺点
		//代理模式会造成系统设计中类的增加
		//在客户端和目标对象之间 增加了代理对象  请求处理速度变慢
		///增加系统复杂度

	}
}
