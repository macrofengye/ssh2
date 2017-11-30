package com.niydiy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niydiy.dao.UserDao;
import com.niydiy.entity.User;
import com.niydiy.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

}
