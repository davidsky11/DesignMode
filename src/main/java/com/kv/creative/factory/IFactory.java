package com.kv.creative.factory;

public interface IFactory {

	public IUserDao createUserDao();
	
	public IDeptDao createDeptDao();
	
}
