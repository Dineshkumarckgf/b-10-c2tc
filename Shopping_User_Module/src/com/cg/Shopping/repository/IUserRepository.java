package com.cg.Shopping.repository;

import com.cg.Shopping.entities.User;

public interface IUserRepository {

	public User addnewUser(User user) ;
	public User updateUser(User user);
	void deleteUser(int id);
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	public void login(User user);
	public void logout();
	
	
}
