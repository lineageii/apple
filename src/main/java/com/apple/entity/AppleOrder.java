/**
 * 
 */
package com.apple.entity;

import java.io.Serializable;

/**
 * @author hujiag@gmail.com
 *
 */
public class AppleOrder implements Serializable {

	private static final long serialVersionUID = 255457907799227197L;
	
	private String orderNo;
	private String appleId;
	/** 订单状态  1:下单 2:已经付款 3:到货 4:出货 5:订单过期 6:订单取消 */
	private String status;
	/** 商品名称 iphone3, iphone4_16b, iphone4_32b*/
	private String goodsName;
	
	private String lastname;
	private String firstname;
	private String address;
	private String phoneno;
	private String orderDate;
	private String shipDate;
	private String arrivalDate;
}
