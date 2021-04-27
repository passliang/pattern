package com.style.pattern.proxy.staticproxy;

/**
 * @author leon
 * @date 2021-04-25 13:44:56
 */
public class Test {
	public static void main(String[] args) {
		ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new ZhangSan());
		zhangLaoSan.findLove();
		//这时候 再来个李四找对象  张老三 并不能代理了
		//要是想代理李四的话 需要再来一个李老四来代理 李四找对象
		LiLaoSi liLaoSi = new LiLaoSi(new LiSi());
		liLaoSi.findLove();
	}
}
