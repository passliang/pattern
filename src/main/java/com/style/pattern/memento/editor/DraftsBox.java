package com.style.pattern.memento.editor;

import java.util.Stack;

/**
 * 草稿箱
 *
 * @author leon
 * @date 2021-04-18 16:09:28
 */
public class DraftsBox {
	private static final Stack<ArticleMemento> STACK = new Stack<>();

	public ArticleMemento getArticleMemento() {
		return STACK.pop();
	}

	public void addArticleMemento(ArticleMemento articleMemento) {
		STACK.push(articleMemento);
	}
}
