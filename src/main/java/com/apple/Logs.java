package com.apple;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Logs {
	private static Log log;
	/**
	 * Define a static Log variable,
	 */
	static {
		try {
			log = LogFactory.getLog("LOG");
		} catch (Exception ex) {
			System.out.println("can't init the Logger, caused by: " + ex);
		}
	}

	/**
	 * Get the log object
	 * 
	 * @return Log
	 */
	public static Log getLogger() {
		return log;
	}
}