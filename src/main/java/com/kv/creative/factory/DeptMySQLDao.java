package com.kv.creative.factory;

public class DeptMySQLDao implements IDeptDao {

	@Override
	public void insert(Dept u) {
		System.out.println("add an dept in mysql db.");
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an dept with id '" + id + "' in mysql db.");  
	}

}
