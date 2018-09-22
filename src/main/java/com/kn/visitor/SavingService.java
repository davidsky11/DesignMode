package com.kn.visitor;

// 存款
public class SavingService extends Service {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
