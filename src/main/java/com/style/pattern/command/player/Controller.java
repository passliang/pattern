package com.style.pattern.command.player;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 * @date 2021-04-15 23:44:52
 */
public class Controller {

	private List<IAction> actions = new ArrayList<>();

	public void addAction(IAction action) {
		actions.add(action);
	}

	public void execute(IAction action) {
		action.execute();
	}

	public void execute() {
		for (IAction action : actions) {
			action.execute();
		}
	}

}
