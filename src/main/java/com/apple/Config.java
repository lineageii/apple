package com.apple;

import java.util.List;

import org.apache.commons.configuration.Configuration;

@SuppressWarnings("unchecked")
public class Config {
	private static final Configuration config = new ConfigUtil("config.ini").geConfig();
	/** 线程数  */
	public static final int THREAD_POOL_NUM = config.getInt("threadPoolNum");
	/** 报名批处理结束时间 */
	public static final String END_TIME = config.getString("endTime");
	/** 随机名称 */
	public static final List<String> NAME = config.getList("name");
	/** javax.net.ssl.trustStore */
	public static final String TRUST_STORE = config.getString("javax.net.ssl.trustStore");
	private Config() {

	}
}
