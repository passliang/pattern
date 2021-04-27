package com.style.pattern.visitor.kpi;

/**
 * @author leon
 * @date 2021-04-23 15:49:13
 */
public class CtoVisitor implements Visitor{

	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师: "+engineer.getName()+ " kpi:"+engineer.getKpi()+ "代码量: "+engineer.getCodeLines());
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("产品经理: "+manager.getName()+ " kpi: "+manager.getKpi()+ "产品数量: "+manager.getProducts());

	}
}
