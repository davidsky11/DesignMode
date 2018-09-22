package com.kn.visitor;

// 服务接口
public abstract class Service {

	public abstract void accept(Visitor v);
	
	public int getCounterNum() {
		return (int) Math.floor(Math.random() * 4);
	}
}
