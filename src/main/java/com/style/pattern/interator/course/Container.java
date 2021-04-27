package com.style.pattern.interator.course;

/**
 * @author leon
 * @date 2021-04-15 22:47:15
 */
public interface Container<E> {
	/**
	 * 集合添加
	 *
	 * @param e e
	 */
	void add(E e);

	/**
	 * 集合移除
	 *
	 * @param e e
	 */
	void remove(E e);

	/**
	 * 迭代
	 *
	 * @return Iterator<E>
	 */
	Iterator<E> iterator();
}
