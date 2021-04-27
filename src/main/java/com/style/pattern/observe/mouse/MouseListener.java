package com.style.pattern.observe.mouse;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 鼠标监听者
 *
 * @author leon
 * @date 2021-04-23 11:09:45
 */
public class MouseListener {
	Map<String, Event> eventMap = new HashMap<>();

	public void addListener(String type, Event event) {
		eventMap.put(type, event);
	}

	public void trigger(String type) {
		if (!eventMap.containsKey(type)) {
			return;
		}
		Event event = eventMap.get(type);
		EventCallBack callBack = event.getCallBack();
		if (null != callBack) {
			try {
				Method method = callBack.getClass().getMethod("trigger" + upFirstLetter(type));
				method.invoke(callBack);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


	public String upFirstLetter(String methodName) {
		char[] chars = methodName.toCharArray();
		chars[0] -= 32;
		return new String(chars);
	}

}
