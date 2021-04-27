package com.style.pattern.command.player;

import com.style.pattern.command.player.actions.PauseAction;
import com.style.pattern.command.player.actions.PlayAction;
import com.style.pattern.command.player.actions.StopAction;

/**
 * @author leon
 * @date 2021-04-15 23:46:06
 */
public class Test {
	public static void main(String[] args) {
		Controller controller = new Controller();
		Player player = new Player();
		controller.execute(new StopAction(player));

		controller.addAction(new StopAction(player));
		controller.addAction(new PauseAction(player));
		controller.addAction(new PlayAction(player));

		controller.execute();
		//优点
		//1. 引入中间层(抽象类) 解耦命令请求与实现
		//2. 扩展性好 方便增加新的命令
		//3. 支持组合命令 支持命令队列
		//4. 支持现在命令上增加新的功能 可使用包装器模式
		//缺点
		//1. 具体命令类太多
		//2. 增加程序复杂度,理解更为复杂


	}
}
