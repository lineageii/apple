package com.apple.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.apple.User;
import com.apple.constants.OrderStatus;
import com.apple.dao.OrderDao;
import com.apple.dao.UserDao;
import com.apple.entity.AppleOrder;
import com.apple.utils.DateUtil;

public class AppleService {
	private UserDao userDao;
	private OrderDao orderDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public OrderDao getOrderDao() {
		return orderDao;
	}
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void save(List<User> users) {
		for(User user : users){
			for(AppleOrder appleOrder : user.getOrders()){
			if(StringUtils.isEmpty(appleOrder.getOrderNo())) {
				continue;
			}
			appleOrder.setAppleId(user.getAppleId());
			appleOrder.setAddress(user.getStreet());
			appleOrder.setArrivalDate("");
			appleOrder.setFirstname(user.getFirstName());
			appleOrder.setLastname(user.getLastName());
			appleOrder.setOrderDate(DateUtil.getSysDate());
			appleOrder.setPhoneno(user.getPhoneNumber());
			appleOrder.setShipDate("");
			appleOrder.setStatus(String.valueOf(OrderStatus.已下单.ordinal()));
			orderDao.insertOrder(appleOrder);
		}
		}
	}
}
