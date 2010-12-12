/**
 * 
 */
package com.apple.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.apple.entity.AppleUser;

/**
 * @author hujia
 *
 */
public class UserDaoImpl implements com.apple.dao.UserDao {

	private JdbcTemplate jdbcTemplate;
	private String insertSql;
	
	/* (non-Javadoc)
	 * @see com.apple.dao.UserDao#getList()
	 */
	public List<AppleUser> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.apple.dao.UserDao#insert(com.apple.entity.AppleUser)
	 */
	public void insert(AppleUser user) {
		jdbcTemplate.update(insertSql, user.getAppleid(), user.getPassword());

	}

	/* (non-Javadoc)
	 * @see com.apple.dao.UserDao#update(com.apple.entity.AppleUser)
	 */
	public void update(AppleUser user) {
		// TODO Auto-generated method stub

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getInsertSql() {
		return insertSql;
	}

	public void setInsertSql(String insertSql) {
		this.insertSql = insertSql;
	}

	
}
