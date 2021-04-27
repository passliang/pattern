package com.style.pattern.interator.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-15 22:47:15
 */
public class ContainerImpl<E> implements Container<E> {

	private final List<E> list;

	public ContainerImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void add(E e) {
		list.add(e);
	}

	@Override
	public void remove(E e) {
		list.remove(e);
	}

	@Override
	public Iterator<E> iterator() {
		return new IteratorImpl<>(list);
	}
}
