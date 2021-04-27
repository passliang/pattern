package com.style.pattern.memento.editor;

/**
 * 文章备忘录
 *
 * @author leon
 * @date 2021-04-18 16:05:18
 */
public class ArticleMemento {
	private String title;
	private String content;

	private String image;

	public ArticleMemento(String title, String content, String image) {
		this.title = title;
		this.content = content;
		this.image = image;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ArticleMemento{" +
				"title='" + title + '\'' +
				", content='" + content + '\'' +
				", image='" + image + '\'' +
				'}';
	}
}
