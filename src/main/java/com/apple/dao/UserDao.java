package com.apple.dao;

import java.util.List;

import com.apple.User;
import com.apple.entity.AppleUser;

public interface UserDao {
	List<AppleUser> getList();
	void insert(AppleUser user);
	void update(AppleUser user);
}
