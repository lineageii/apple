package com.apple;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigUtil {

	private final String ENCODING = "UTF-8";

	private PropertiesConfiguration configuration ;

	private  PropertiesConfiguration initialize(String fileName) {
		PropertiesConfiguration config = null;
		config = new PropertiesConfiguration();
		config.setEncoding(ENCODING);
		try {
			config.load(fileName);
		} catch (ConfigurationException e) {
			Logs.getLogger().error(e);
		}
		return config;
	}

	public ConfigUtil(String fileName) {
		configuration = initialize(fileName);
	}

	public Configuration geConfig() {
		return configuration;
	}
}
