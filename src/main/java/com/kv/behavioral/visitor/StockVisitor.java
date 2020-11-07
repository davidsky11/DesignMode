package com.kv.behavioral.visitor;

// 股票第三方存款业务办理者
public class StockVisitor implements Visitor {

	@Override
	public void visit(DrawService s) {
		System.out.println("您办理的是股票交易第三方取款业务。" + "请到 " + s.getCounterNum() + " 窗口。"); 
	}

	@Override
	public void visit(SavingService s) {
		System.out.println("您办理的是股票交易第三方存款业务。" + "请到 " + s.getCounterNum() + " 窗口。");
	}

}
