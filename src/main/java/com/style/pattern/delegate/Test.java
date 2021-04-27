package com.style.pattern.delegate;

/**
 * @author leon
 * @date 2021-04-10 13:46:48
 */
public class Test {
	public static void main(String[] args) {
		//委派模式 属于行为型模式 不属于GOF23中设计模式
		Boss boss = new Boss();
		Leader leader = new Leader();
		boss.command("python", leader);
		boss.command("海报", leader);
		boss.command("Java", leader);
		//源码案例
		//1. 类加载器双亲委派模型
		//2. jdk. Method 中invoke
		// spring
		//org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.doRegisterBeanDefinitions
		///	parseBeanDefinitions(root, this.delegate);
		//		this.delegate = createDelegate(getReaderContext(), root, parent);
		//org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.createDelegate
		//根据不同delegate 实现不同解析beanDefinition
		//org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.parseBeanDefinitions
		//org.springframework.beans.factory.xml.BeanDefinitionParserDelegate.parseCustomElement(org.w3c.dom.Element)
		//  dispatchServlet   dispatch
		//优点 将任务细化  统一关注每个子任务完成情况 加快任务效率
		//缺点
	}
}
