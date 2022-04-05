package com.cg.Shopping.Client;

import com.cg.Shopping.service.IUserService;
import com.cg.Shopping.service.UserServiceImpl;
import com.cg.Shopping.entities.User;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		User user = new User();
		
		IUserService service = new UserServiceImpl();
		user.setId(2100903);
		user.setName("Dinesh");
		user.setType("Electronics");
		user.setPassword("Dinesh27");
		service.addnewUser(user);
		
	
		System.out.println("ID is:"+user.getId());
		System.out.println("Name is:"+user.getName());
		
	}

}
