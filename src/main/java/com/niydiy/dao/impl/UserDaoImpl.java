package com.niydiy.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.niydiy.dao.UserDao;
import com.niydiy.entity.User;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	@Resource
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}
}
