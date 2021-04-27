package com.style.pattern.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leon
 * @date 2021-04-08 22:22:39
 */
public class JsonLoggerFactory {

	public static JsonLogger getLogger(Class<?> clazz) {
		Logger logger = LoggerFactory.getLogger(clazz);
		return new JsonLogger(logger);
	}
}
