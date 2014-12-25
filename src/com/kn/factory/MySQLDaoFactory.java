package com.kn.factory;

public class MySQLDaoFactory implements IFactory {

	@Override
	public UserDao createUserDao() {
		return new UserMySQLDao();
	}

	@Override
	public DeptDao createDeptDao() {
		return new DeptMySQLDao();
	}

}
