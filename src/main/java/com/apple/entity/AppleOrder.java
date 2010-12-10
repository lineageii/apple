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
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getAppleId() {
		return appleId;
	}
	public void setAppleId(String appleId) {
		this.appleId = appleId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	
}
