package com.kv.behavioral.visitor;

// 访问者接口
public interface Visitor {

	public void visit(DrawService s);
	
	public void visit(SavingService s);
}
