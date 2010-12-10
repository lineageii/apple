package com.apple.dao;

import java.util.List;

import com.apple.entity.AppleOrder;

public interface OrderDao {

	List<AppleOrder> getOrderList();
	void insertOrder(AppleOrder order);
	void updateOrder(AppleOrder order);
	
}
