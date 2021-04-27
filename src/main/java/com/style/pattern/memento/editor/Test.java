package com.style.pattern.memento.editor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author leon
 * @date 2021-04-20 22:11:29
 */
@Slf4j
public class Test {
	public static void main(String[] args) {
		DraftsBox draftsBox = new DraftsBox();
		Editor editor = new Editor("手写spring", "spring 源码分析 ", "1.png");
		ArticleMemento save = editor.save();
		log.info("暂存内容:{},{},{}", save.getTitle(), save.getContent(), save.getImage());
		draftsBox.addArticleMemento(save);
		log.info("=======文章保存到草稿箱==========");

		editor.setTitle("手写spring2");
		editor.setContent("spring 源码分析2");
		ArticleMemento save1 = editor.save();
		log.info("第一次修改内容:{},{},{}", save1.getTitle(), save1.getContent(), save1.getImage());
		draftsBox.addArticleMemento(save1);
		log.info("第一次保存到草稿箱:{},{},{}", save1.getTitle(), save1.getContent(), save1.getImage());


		editor.setTitle("手写spring3");
		editor.setContent("spring 源码分析3");
		editor.undo(save1);
		log.info("第二次修改撤销内容:{},{},{}", save1.getTitle(), save1.getContent(), save1.getImage());

		ArticleMemento articleMemento = draftsBox.getArticleMemento();
		log.info("第一次回滚:{},{},{}", articleMemento.getTitle(), articleMemento.getContent(), articleMemento.getImage());

		ArticleMemento articleMemento2 = draftsBox.getArticleMemento();
		log.info("第二次回滚:{},{},{}", articleMemento2.getTitle(), articleMemento2.getContent(), articleMemento2.getImage());

		//优点
		//1. 简化发起人实体类职责 隔离状态存储与读取  实现信息封装 客户端不用关心保存细节
		//2. 提供状态回滚功能
		//缺点
		//1.资源消耗增加 如果保存过多的状态 会增加资源的消耗
	}
}
