package com.apple;

import java.io.IOException;
import java.net.MalformedURLException;

import org.xml.sax.SAXException;

public class IphoneMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAppleId("hujiag8@eyou.com");
		user.setPassword("pengyan");
		user.setEmail("hujiag8@eyou.com");
		user.openApple();
		user.addToCart();
		user.checkoutx();
		user.invoice();
		user.checkoutxForShip();
		user.status();
		
	}

}
