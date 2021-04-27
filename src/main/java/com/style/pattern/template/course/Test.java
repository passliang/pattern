package com.style.pattern.template.course;

/**
 * @author leon
 * @date 2021-04-11 14:56:10
 */
public class Test {
	public static void main(String[] args) {
		JavaCourse java = new JavaCourse();
		java.setNeedCheckHomeWork(true);
		java.publish();
		System.out.println("=====================");
		PythonCourse python = new PythonCourse();
		python.setNeedCheckHomeWork(false);
		python.publish();
		//源码中应用
		//1.jdk abstractList
		//2.jdk httpServlet
		//3.spring jdbc  jdbcTemplate
		//4.mybatis baseExecutor  --> SimpleExecutor BatchExecutor  ReuseExecutor
		//101362473037

		//优点
		//1.将相同处理逻辑放到抽象父类中 可以提高代码复用性
		//2. 将不同代码放到不同子类中 通过对子类扩展增加新的行为 提高代码可扩展行
		//3.将不变的行为放到父类上 去除子类重复代码 提供一个很好代码复用平台 符合开闭原则
		//缺点
		//1.类数目增加 每个抽象类都需要子类实现 导致类个数增加
		//2.类数目增加 间接增加了系统实现复杂度
		//3.集成关系自身缺点 父类增加新的抽象方法 所有子类都要改一遍 

	}
}
