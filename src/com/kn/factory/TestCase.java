package com.kn.factory;

import org.junit.Test;

import com.kn.factory.Constant.DBTYPE;

public class TestCase {
	
	IFactory factory = null;
	
	@Test
	public void test0() {
//		factory = DBFactory.createDBFactory(DBTYPE.Oracle);
//		factory = DBFactory.createDBFactory(DBTYPE.MySQL);
		factory = DBFactory.createDBFactory(DBTYPE.DB2);
		IUserDao userDao = factory.createUserDao();
		userDao.insert(new User());
		userDao.deleteById("test");
		
		IDeptDao deptDao = factory.createDeptDao();
		deptDao.insert(new Dept());
		deptDao.deleteById("test");
		System.out.println();
	}
	
//	@Test
//	public void test1() {
//		DBType type = new DBType();
//		type.setDbName("MySql");
//		
//		factory = DBFactory.createDBFactory(type);
//		factory.createUserDao();
//		
//		IUserDao ud0 = new UserDaoImpl(type);
//		
//		ud0.deleteById("test");
//		ud0.insert(null);
//	}
}
