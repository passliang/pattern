package com.style.pattern.chain.auth.v2;

/**
 * @author leon
 * @date 2021-04-14 23:09:29
 */
public class Test {
	public static void main(String[] args) {
		MemberService.login("1231", "123456");
		//javax filter -> FilterChain  org.springframework.mock.web.MockFilterChain
		//netty channelPipeLine
		//security
		//优点
		// 1. 请求于处理解构
		// 2. 请求处理者(节点对象)只关注自己感兴趣的事件 不感觉直接转发到下一处理器
		// 3. 具备链式传递处理请求功能 请求者无需知道链路 只关注结果即可
		// 4. 链路结构灵活 可动态删除增加链路
		//5. 易于扩展新的链路请求处理类 符合开闭原则
		//缺点
		//1.责任链太长或者处理请求太长 影响整体性能
		//2.节点对象存在 循环引用 会造成死循环 系统崩溃

	}
}
