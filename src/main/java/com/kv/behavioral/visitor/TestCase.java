package com.kv.behavioral.visitor;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		DrawService ds = new DrawService();
		DrawService ss = new DrawService();
		
		Visitor v0 = new CommonVisitor();
		v0.visit(ds);
		v0.visit(ss);
		
		Visitor v1 = new CompanyVisitor();
		v1.visit(ds);
		v1.visit(ss);
	}
}
