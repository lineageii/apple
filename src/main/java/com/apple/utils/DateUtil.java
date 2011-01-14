package com.apple.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static final String YYYYMMDD = "yyyyMMdd";
	
	public static String getSysDate(){
		return getSysDate(YYYYMMDD);
	}
	
	public static String getSysDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
}
