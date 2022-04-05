package com.cg.Shopping.repository;

import javax.persistence.EntityManager;

import com.cg.Shopping.entities.User;

public class UserRepositoryImp implements IUserRepository{
	private EntityManager entityManager;
	public UserRepositoryImp() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public User addnewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}
	@Override
	public void login(User user) {
		entityManager.getTransaction().begin();
	}
	@Override
	public void logout() {
		entityManager.getTransaction().commit();
	}
	@Override
	public void deleteUser(int id) {

		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		
	}
}


