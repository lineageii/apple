package com.apple.common;
import java.util.Random;
import com.apple.Config;

/**
 * 随机取得姓名
 * @author hujiag@gmail.com
 *
 */
public class RandomName {
	public static Random rnd = new Random();
	public static String getName() {
		return Config.NAME.get(rnd.nextInt(Config.NAME.size()));
	}
}
