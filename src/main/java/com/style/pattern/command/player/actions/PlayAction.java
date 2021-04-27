package com.style.pattern.command.player.actions;

import com.style.pattern.command.player.IAction;
import com.style.pattern.command.player.Player;

/**
 * @author leon
 * @date 2021-04-15 23:42:06
 */
public class PlayAction implements IAction {

	private final Player player;

	public PlayAction(Player player) {
		this.player = player;
	}

	@Override
	public void execute() {
		player.play();
	}
}
