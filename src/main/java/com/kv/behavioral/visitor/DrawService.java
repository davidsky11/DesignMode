package com.kv.behavioral.visitor;

// 取款
public class DrawService extends Service {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
