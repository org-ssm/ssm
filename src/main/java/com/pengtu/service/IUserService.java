package com.pengtu.service;

import com.pengtu.model.User;

public interface IUserService {
	public User selectByPrimaryKey(String id);
}
