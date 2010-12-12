package com.apple;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

import com.apple.dao.OrderDao;
import com.apple.dao.UserDao;
import com.apple.entity.AppleOrder;
import com.apple.entity.AppleUser;
public class DbTest {
	Log log = LogFactory.getLog(DbTest.class);
	private ApplicationContext appContext;
	@Before
	public void setUp() {
		appContext = new ClassPathXmlApplicationContext("spring.xml");
		
		 //SimpleJdbcTestUtils.executeSqlScript((SimpleJdbcTemplate) appContext.getBean("simpleJdbcTemplate"), new ClassPathResource("apple.ddl"), false);
	}
	@Test
	public void TestDb(){
		log.info("insert start");
		UserDao userDao = (UserDao)appContext.getBean("userDao");
		AppleUser user = new AppleUser();
		user.setAppleid("hujiag@gmail.com");
		user.setPassword("pengyan");
		userDao.insert(user);
		
		OrderDao orderDao = (OrderDao)appContext.getBean("orderDao");
		AppleOrder order = new AppleOrder();
		order.setAppleId("hujiag@gmail.com");
		order.setPhoneno("13482379270");
		order.setStatus("1");
		order.setAddress("");
		order.setArrivalDate("20101212");
		order.setFirstname("jiajia");
		order.setLastname("hu");
		order.setGoodsName("aaaa");
		order.setOrderDate("20101212");
		order.setOrderNo("sdfsdf");
		order.setShipDate("20101212");
		orderDao.insertOrder(order);
		log.info("insert end");
	}
	
	@After
	public void tearDown(){
	}
	
}
