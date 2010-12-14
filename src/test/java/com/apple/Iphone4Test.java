package com.apple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class Iphone4Test extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		// selenium = new DefaultSelenium("localhost", 4444, "*firefoxproxy c:\\Program Files\\Mozilla Firefox\\firefox.exe", "http://store.apple.com/");
         //selenium.start();
		//setUp("http://store.apple.com/", "*custom C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		// 
//		 selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://store.apple.com/");
//         selenium.start();
		//setUp("http://store.apple.com/", "*googlechrome");
		selenium = new DefaultSelenium("localhost", 4444, "*firefoxproxy c:\\Program Files\\Mozilla Firefox\\firefox.exe", "http://store.apple.com/");
        selenium.start();
        
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
	
	
	public void test3gs_test1() throws Exception {
		selenium.open("/cn/browse/home/shop_iphone/family/iphone");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("300000");
		selenium.click("add-to-cart");
		selenium.waitForPageToLoad("300000");
		selenium.click("checkout-now");
		Thread.sleep(20000);
//		while(!selenium.isElementPresent("login-appleId")){
//			Thread.sleep(1000);
//		}
		//Assert.assertTrue(selenium.isTextPresent("输入您的 Apple ID 和密码"));
		//selenium.click("login-appleId");
		
		selenium.type("xpath=//input[@name='login-appleId']", "hujiag9@eyou.com");
		selenium.click("login-password");
		selenium.type("login-password", "pengyan");
		selenium.click("sign-in");
		System.out.println("111111");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if ("5".equals(selenium.getSpeed()))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (selenium.isElementPresent("shipping-continue-button"))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		selenium.click("shipping-continue-button");
		selenium.waitForPageToLoad("3000");
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (selenium.isElementPresent("payment-form-options-28"))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		selenium.click("payment-form-options-28");
		selenium.click("payment-continue-button");
		selenium.waitForPageToLoad("5000");
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (selenium
						.isElementPresent("invoice-user-copy-from-shipping-button"))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		selenium.click("invoice-user-copy-from-shipping-button");
		selenium.waitForPageToLoad("2000");
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (selenium
						.isElementPresent("invoice-user-address-emailAddress"))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		selenium.click("invoice-user-address-emailAddress");
		selenium.type("invoice-user-address-emailAddress", "hujiag9@eyou.com");
		selenium.click("invoice-next-step");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPageToLoad("2000");
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (selenium.isElementPresent("terms-accept"))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		selenium.click("terms-accept");
		selenium.click("terms-continue-button");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPageToLoad("3000");
		selenium.click("place-order-button");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPopUp("_top", "30000");
		selenium.waitForPopUp("_top", "30000");
	}
}
