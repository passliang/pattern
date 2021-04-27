package com.style.pattern.memento.editor;

/**
 * 编辑器
 *
 * @author leon
 * @date 2021-04-18 16:06:19
 */

public class Editor {

	private String title;
	private String content;

	private String image;

	public Editor(String title, String content, String image) {
		this.title = title;
		this.content = content;
		this.image = image;
	}

	public ArticleMemento save() {
		return new ArticleMemento(this.title, this.content, this.image);
	}

	public void undo(ArticleMemento articleMemento) {
		this.title = articleMemento.getTitle();
		this.content = articleMemento.getContent();
		this.image = articleMemento.getImage();
	}


	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getImage() {
		return image;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Editor{" +
				"title='" + title + '\'' +
				", content='" + content + '\'' +
				", image='" + image + '\'' +
				'}';
	}
}
