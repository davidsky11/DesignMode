package com.kv.creative.factory;

public class UserDaoImpl implements IUserDao {

	DBType type;
	
	public DBType getType() {
		return type;
	}

	public void setType(DBType type) {
		this.type = type;
	}
	
	public UserDaoImpl(DBType type) {
		setType(type);
	}

	@Override
	public void insert(User u) {
		System.out.println("add an user in " + type.getDbName() + " db.");
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an user with id '" + id + "' in " + type.getDbName() + " db."); 
	}

}
