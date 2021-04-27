package com.style.pattern.visitor.kpi;

/**
 * @author leon
 * @date 2021-04-23 16:19:33
 */
public class Test {
	public static void main(String[] args) {
		Report report = new Report();
		Visitor cto = new CtoVisitor();
		Visitor ceo = new CeoVisitor();
		System.out.println("============cto==================");
		report.show(cto);
		System.out.println("============ceo==================");
		report.show(ceo);


		//jdk fileVisitor
		//spring BeanDefinitionVisitor
		//org.springframework.beans.factory.config.BeanDefinitionVisitor.visitBeanDefinition
		//优点
		//1. 解耦数据结构与数据访问  使得操作集合可以独立变化
		//2. 扩展性好 可以通过扩展访问者角色 来实现对数据集不用操作
		//3. 元素具体类型并非单一 访问者均可操作
		//4. 各角色职责分离 符合单一职责原则
		//缺点
		//1. 无法增加元素类型 若系统数据结构对象易于变化 经常有新的数据对象增加进来 则访问者类必须增加对应元素的操作 违背了开闭原则
		//2. 具体元素变更困难 具体元素增加属性 删除属性等操作会导致对应的访问者类需要进行相应修改 尤其有大量访问者 需要修改的类太多
		//3. 违背依赖倒置原则 为了达到区别对待 访问者依赖具体元素类型 而不是抽象

	}
}
