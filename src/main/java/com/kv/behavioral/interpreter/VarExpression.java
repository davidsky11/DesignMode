package com.kv.behavioral.interpreter;

import java.util.HashMap;

public class VarExpression implements Expression {

	private String key;
	
	public VarExpression(String key) {
		this.key = key;
	}
	
	@Override
	public int interprete(HashMap<String, Integer> var) {
		return (Integer) var.get(this.key);
	}

}
