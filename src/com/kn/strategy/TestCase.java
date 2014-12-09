package com.kn.strategy;

import org.junit.Test;

// 测试用例
public class TestCase {
	
	@Test
	public void test() {
		Context context;
	
		context = new Context(new FirstStrategy());
		context.execute();
		
		context = new Context(new SecondStrategy());
		context.execute();
		
		context = new Context(new ThirdStrategy());
		context.execute();
	}
	
}
