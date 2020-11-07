package com.kv.behavioral.visitor;

// 普通存款取款访问者
public class CommonVisitor implements Visitor {

	@Override
	public void visit(DrawService s) {
		System.out.println("您办理的是普通取款业务。" + "请到 " + s.getCounterNum() + " 窗口。");  
	}

	@Override
	public void visit(SavingService s) {
		System.out.println("您办理的是普通存款业务。"  + "请到 " + s.getCounterNum() + " 窗口。");  
	}
}
