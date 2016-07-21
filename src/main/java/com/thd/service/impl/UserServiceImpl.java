package com.thd.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thd.bean.User;
import com.thd.dao.UserMapper;
import com.thd.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private UserMapper userMapper;
	private Logger log = Logger.getLogger(this.getClass());
	
	public UserMapper getUserMapper() {
        return userMapper;
    }

	@Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
	
	@Override
	public User findUser(String userId) {
		log.info("Provider:findUser()");
		return userMapper.selectByPrimaryKey(Integer.valueOf(userId));
	}
	
	@Override
	public User findUserByName(String userName) {
		log.info("Provider:findUser()");
		return userMapper.selectByUserName(userName);
	}

	@Override
	public void saveUser(User user) {
		log.info("Provider:saveUser()");
		System.out.println(" save user ...");
	}
	
	
}
