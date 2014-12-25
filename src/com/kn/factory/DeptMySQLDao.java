package com.kn.factory;

public class DeptMySQLDao implements DeptDao {

	@Override
	public void insert(Dept u) {
		System.out.println("add an dept in mysql db.");
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an dept with id '" + id + "' in mysql db.");  
	}

}
