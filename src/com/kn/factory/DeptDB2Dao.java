package com.kn.factory;

public class DeptDB2Dao implements DeptDao {

	@Override
	public void insert(Dept d) {
		System.out.println("add an user in DB2 db.");
	}

	@Override
	public void deleteById(String id) {
		 System.out.println("delete an user in DB2 db."); 
	}

}
