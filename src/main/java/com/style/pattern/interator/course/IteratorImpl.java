package com.style.pattern.interator.course;

import java.util.List;

/**
 * @author leon
 * @date 2021-04-15 22:37:53
 */
public class IteratorImpl<E> implements Iterator<E> {

	private final List<E> list;

	public IteratorImpl(List<E> list) {
		this.list = list;
	}

	private E next;

	private int cursor = 0;

	@Override
	public E next() {
		next = list.get(cursor);
		cursor++;
		return next;
	}

	@Override
	public boolean hasNext() {
		if (cursor > list.size() - 1) {
			return false;
		}
		return true;
	}
}
