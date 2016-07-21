package com.thd.dao;

import com.thd.bean.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);
	
	User selectByUserName(String userName);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}