package com.kv.creative.factory;

public class DeptOracleDao implements IDeptDao {

	@Override
	public void insert(Dept u) {
		System.out.println("add an dept in oracle db."); 
	}

	@Override
	public void deleteById(String id) {
		System.out.println("delete an dept with id '" + id + "' in oracle db.");  
	}

}
