package com.style.pattern.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * @author leon
 * @date 2021-04-08 22:17:11
 */
public class JsonLogger extends LoggerDecorator {

	public JsonLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void info(String s) {
		JSONObject jo = new JSONObject();
		jo.put("message",s);
		System.out.println(jo.toString());
	}

	@Override
	public void error(String s) {
		JSONObject jo = new JSONObject();
		jo.put("message",s);
		System.out.println(jo.toString());
	}

	public void error(Throwable throwable){
		JSONObject jo = new JSONObject();
		jo.put("message",throwable.getMessage());
		System.out.println(jo.toString());
	}



}
