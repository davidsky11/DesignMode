package com.kn.factory;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		IFactory f = new OracleDaoFactory();
		UserDao userDao = f.createUserDao();
		userDao.insert(new User());
		userDao.deleteById("123");
		
		DeptDao deptDao = f.createDeptDao();
		deptDao.insert(new Dept());
		deptDao.deleteById("234");
	}
}
