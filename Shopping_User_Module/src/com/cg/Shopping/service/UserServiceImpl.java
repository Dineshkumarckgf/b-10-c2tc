package com.cg.Shopping.service;

import com.cg.Shopping.entities.User;
import com.cg.Shopping.repository.IUserRepository;
import com.cg.Shopping.repository.UserRepositoryImp;


public class UserServiceImpl implements IUserService{

private IUserRepository dao;
	
	public UserServiceImpl() 
	{
		dao = new UserRepositoryImp();
	}
	@Override
	public User addnewUser(User user) {
		dao.beginTransaction();
		dao.addnewUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User login(User user) {
		dao.beginTransaction();
		dao.login(user);
		dao.commitTrasaction();
		return user;
	
	}

	@Override
	public boolean logout() {
		dao.beginTransaction();
		dao.logout();
		dao.commitTrasaction();
		return true;
	}

}
