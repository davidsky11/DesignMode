package com.kn.factory;

public class OracleDaoFactory implements IFactory {

	public UserDao createUserDao() {
		return new UserOracleDao();
	}

	public DeptDao createDeptDao() {
		return new DeptOracleDao();
	}
}
