package com.kn.factory;

public class DB2DaoFactory implements IFactory {

	public UserDao createUserDao() {
		return new UserDB2Dao();
	}

	public DeptDao createDeptDao() {
		return new DeptDB2Dao();
	}
}
