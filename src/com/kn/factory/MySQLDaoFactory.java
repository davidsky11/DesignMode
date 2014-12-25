package com.kn.factory;

public class MySQLDaoFactory implements IFactory {

	@Override
	public IUserDao createUserDao() {
		return new UserMySQLDao();
	}
	
	@Override
	public IDeptDao createDeptDao() {
		return new DeptMySQLDao();
	}

}
