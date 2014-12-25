package com.kn.factory;

public interface IFactory {

	public IUserDao createUserDao();
	
	public IDeptDao createDeptDao();
	
}
