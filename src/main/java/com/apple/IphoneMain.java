package com.apple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IphoneMain {

	// 从配置文件中取出最大线程，初始化线程池
	private static ExecutorService exec = Executors
			.newFixedThreadPool(Config.THREAD_POOL_NUM);

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Logs.getLogger().info("开始");

		// 取得密码正确的注册用户
		List<User> users = new ArrayList<User>();

		try {
			Logs.getLogger().info("开始取得用户列表");
			users = getUsers();

		} catch (Exception e) {
			Logs.getLogger().error("取得用户列表错误", e);
			return;
		}

		// LOOP START
		while (true) {
			// 开始时间
			long startTime = System.currentTimeMillis();

			int userSize = users.size();
			Logs.getLogger().info("用户数:" + userSize);

			// 监视单个线程
			final CountDownLatch doneSignal = new CountDownLatch(userSize);

			for (final User user : users) {
				Runnable run = new Runnable() {
					public void run() {
						try {
							// 1 iphone3 8
							// 2 iphone4 16
							// 3 iphone4 32
							user.buy(1);
						} catch (Exception e) {
							Logs.getLogger().error(e);
							Logs.getLogger().error("出错用户信息：" + user.toString());
						} finally {
							doneSignal.countDown();
						}
					}
				};
				// 线程池里添加线程
				exec.execute(run);
			}

			doneSignal.await(); // wait for all to finish
			// 结束时间
			long endTime = System.currentTimeMillis();
			// 用时
			long usedTime = (endTime - startTime);
			Logs.getLogger().info("用时： " + usedTime + " MS");

			// 结束时间停止进程
			if (isEndTime()) {
				exec.shutdown(); // must shutdown
				return;
			}
		}
		// LOOP END

	}

	/**
	 * 是否到结束时间
	 * 
	 * @return boolean
	 * @throws ParseException
	 */
	private static boolean isEndTime() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date nowDate = Calendar.getInstance().getTime();
		String dateStr = dateFormat.format(nowDate);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date endTime = df.parse(dateStr + " " + Config.END_TIME);
		Logs.getLogger().info("结束时间" + endTime);
		return nowDate.after(endTime);
	}

	private static List<User> getUsers() {
		List<User> startUsers = new ArrayList<User>();
		for(int i = 1 ; i<=2 ; i++){
			User user = new User();
			user.setAppleId("hujiag"+ i +"@eyou.com");
			user.setPassword("pengyan");
			user.setEmail("hujiag"+ i +"@eyou.com");
			startUsers.add(user);
		}
		return startUsers;
	}
}
