package com.style.pattern.strategy.pay;


import java.math.BigDecimal;

/**
 * @author leon
 * @date 2021-04-12 22:46:41
 */
public class Test {
	public static void main(String[] args) {
		Order order = new Order("笔记本", BigDecimal.valueOf(500.00));
		String result = order.pay("union");
		System.out.println(result);
		//优点
		// 1.符合开闭原则 2.避免使用 多重条件转移语句 if else 代码精简 3.提交算法的保密性和安全性
		//缺点
		//客户端必须知道有多少策略 自行选择 2.增加很多策略类 类数目增加

		// 源码中应用
		//1.dispatcherServlet 中 doDispatch
		// org.springframework.web.servlet.DispatcherServlet.doDispatch
		// org.springframework.web.servlet.DispatcherServlet.getHandlerAdapter
		//jdk comparator java.util.Arrays.parallelSort(T[], java.util.Comparator<? super T>)
		//jdk treeMap java.util.TreeMap.TreeMap(java.util.Comparator<? super K>)
		// spring resource -> fileSystemResource urlResource
		/// spring org.springframework.beans.factory.support.InstantiationStrategy  CglibSubclassingInstantiationStrategy SimpleInstantiationStrategy

	}
}
