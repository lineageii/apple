package com.apple.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.apple.dao.OrderDao;
import com.apple.entity.AppleOrder;

public class OrderDaoImpl implements OrderDao {
	private JdbcTemplate jdbcTemplate;
	private String insertSql;
	
	public String getInsertSql() {
		return insertSql;
	}

	public void setInsertSql(String insertSql) {
		this.insertSql = insertSql;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<AppleOrder> getOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	/** INSERT INTO APPLE_ORDER (ORDERNO, APPLEID, STATUS, GOODSNAME, LASTNAME, FIRSTNAME, ADDRESS,
	 *  PHONENO, ORDERDATE, SHIPDATE, ARRIVALDATE) VALUES (?,?,?,?,?,?,?,?,?,?,?) */
	public void insertOrder(AppleOrder order) {
		jdbcTemplate.update(insertSql, order.getOrderNo()
				,order.getAppleId()
				,order.getStatus()
				,order.getGoodsName()
				,order.getLastname()
				,order.getFirstname()
				,order.getAddress()
				,order.getPhoneno()
				,order.getOrderDate()
				,order.getShipDate()
				,order.getArrivalDate()
				);

	}

	public void updateOrder(AppleOrder order) {
		// TODO Auto-generated method stub

	}

}
