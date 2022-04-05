package com.cg.Shopping.service;

import com.cg.Shopping.entities.User;

public interface IUserService {
	public User addnewUser(User user);  
	public User updateUser(User user);  

	public User login(User user);

	public boolean logout();
}
