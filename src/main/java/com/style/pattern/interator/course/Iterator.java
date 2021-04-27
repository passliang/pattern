package com.style.pattern.interator.course;

/**
 * @author leon
 * @date 2021-04-15 22:37:53
 */
public interface Iterator<E> {

	/**
	 * 返回下一个元素
	 *
	 * @return E
	 */
	E next();

	/**
	 * 是否存在下一个
	 *
	 * @return boolean
	 */
	boolean hasNext();
}
