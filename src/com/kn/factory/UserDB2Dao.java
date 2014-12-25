package com.kn.factory;

public class UserDB2Dao implements IUserDao {

	@Override
	public void insert(User u) {
		System.out.println("add an user in DB2 db.");
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an user with id '" + id + "' in DB2 db.");  
	}

}
