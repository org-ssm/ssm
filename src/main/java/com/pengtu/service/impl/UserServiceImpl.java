package com.pengtu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pengtu.dao.UserMapper;
import com.pengtu.model.User;
import com.pengtu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(String id) {
		return userMapper.selectByPrimaryKey(id);
	}
	

	

}
