package com.kv.creative.factory;

public class UserOracleDao implements IUserDao {

	@Override
	public void insert(User u) {
		System.out.println("add an user in oracle db."); 
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an user with id '" + id + "' in oracle db.");  
	}

}
