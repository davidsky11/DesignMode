package com.kn.factory;

import org.junit.Test;

public class TestCase {

	IFactory f;
	
	@Test
	public void test1() {
		IFactory f = new OracleDaoFactory();
		UserDao userDao = f.createUserDao();
		userDao.insert(new User());
		userDao.deleteById("oracle");
		
		DeptDao deptDao = f.createDeptDao();
		deptDao.insert(new Dept());
		deptDao.deleteById("oracle");
		System.out.println();
	}
	
	@Test
	public void test2() {
		IFactory f = new DB2DaoFactory();
		UserDao userDao = f.createUserDao();
		userDao.insert(new User());
		userDao.deleteById("DB2");
		
		DeptDao deptDao = f.createDeptDao();
		deptDao.insert(new Dept());
		deptDao.deleteById("DB2");
		System.out.println();
	}
	
	@Test
	public void test3() {
		IFactory f = new MySQLDaoFactory();
		UserDao userDao = f.createUserDao();
		userDao.insert(new User());
		userDao.deleteById("MySQL");
		
		DeptDao deptDao = f.createDeptDao();
		deptDao.insert(new Dept());
		deptDao.deleteById("MySQL");
		System.out.println();
	}
}
