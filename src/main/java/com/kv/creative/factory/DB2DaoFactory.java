package com.kv.creative.factory;

public class DB2DaoFactory implements IFactory {

	public IUserDao createUserDao() {
		return new UserDB2Dao();
	}

	public IDeptDao createDeptDao() {
		return new DeptDB2Dao();
	}
}
