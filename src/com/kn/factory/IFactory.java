package com.kn.factory;

public interface IFactory {

	public UserDao createUserDao();
	
	public DeptDao createDeptDao();
	
}
