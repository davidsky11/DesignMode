package com.kv.creative.factory;

public class UserMySQLDao implements IUserDao {

	@Override
	public void insert(User u) {
		System.out.println("add an user in mysql db."); 
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an user with id '" + id + "' in mysql db.");  
	}

}
