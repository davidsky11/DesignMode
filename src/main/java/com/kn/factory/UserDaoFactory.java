package com.kn.factory;

public class UserDaoFactory {

	public static IUserDao createUserDao(String type) {
		if ("ORACLE".equals(type)) {
			return new UserOracleDao();
		}
		else if ("DB2".equals(type)) {
			return new UserDB2Dao();
		}
		else if ("MySQL".equals(type)){
			return new UserMySQLDao();
		} else {
			return null;
		}
	}
}
