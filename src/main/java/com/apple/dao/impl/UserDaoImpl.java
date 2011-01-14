/**
 * 
 */
package com.apple.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.apple.User;
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
		return jdbcTemplate.query("select * from APPLE_USER", new ParameterizedRowMapper<AppleUser>(){
			public AppleUser mapRow(ResultSet rs, int index) throws SQLException {
            	AppleUser user = new AppleUser();
            	user.setAppleid(rs.getString("appleid"));
            	user.setPassword(rs.getString("PWD"));
                return user;
			}});
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
