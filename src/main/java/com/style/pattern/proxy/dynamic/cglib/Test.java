package com.style.pattern.proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author leon
 * @date 2021-04-25 14:08:29
 */
public class Test {
	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/usr/local/develop/");
		Matchmaker matchmaker = new Matchmaker();
		LiSi liSi = (LiSi) matchmaker.getInstance(LiSi.class);
		liSi.findLove();
		System.out.println("=============================");
		ZhangSan zhangSan = (ZhangSan) matchmaker.getInstance(ZhangSan.class);
		zhangSan.findLove();

	}
}
