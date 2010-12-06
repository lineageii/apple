package com.apple;

import org.apache.commons.configuration.Configuration;

@SuppressWarnings("unchecked")
public class Config {
	private static final Configuration config = new ConfigUtil("config.ini").geConfig();
	/** 线程数  */
	public static final int THREAD_POOL_NUM = config.getInt("threadPoolNum");
	/** 报名批处理结束时间 */
	public static final String END_TIME = config.getString("endTime");
	
	private Config() {

	}
}
