package com.style.pattern.visitor.kpi;

/**
 * @author leon
 * @date 2021-04-23 15:49:13
 */
public interface Visitor {
	/**
	 * 访问
	 *
	 * @param engineer engineer
	 */
	void visit(Engineer engineer);

	/**
	 * 访问
	 *
	 * @param manager manager
	 */
	void visit(Manager manager);
}
