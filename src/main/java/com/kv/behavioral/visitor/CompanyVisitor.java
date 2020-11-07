package com.kv.behavioral.visitor;

// 公司业务办理者
public class CompanyVisitor implements Visitor {

	@Override
	public void visit(DrawService s) {
		System.out.println("您办理的是公司取款业务。" + "请到 " + s.getCounterNum() + " 窗口。");  
	}

	@Override
	public void visit(SavingService s) {
		System.out.println("您办理的是公司存款业务。" + "请到 " + s.getCounterNum() + " 窗口。");
	}

}
