package com.kv.creative.factory;

public class DeptDB2Dao implements IDeptDao {

	@Override
	public void insert(Dept d) {
		System.out.println("add an dept in DB2 db.");
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an dept with id '" + id + "' in DB2 db.");   
	}

}
