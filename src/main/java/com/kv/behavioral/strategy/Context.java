package com.kv.behavioral.strategy;

public class Context {
	
	Strategy strategy;
	
	// 构造器
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute() {
		this.strategy.execute();
	}

}
