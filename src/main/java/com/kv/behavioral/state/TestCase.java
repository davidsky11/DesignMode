package com.kv.behavioral.state;

import org.junit.Test;

// 测试用例
public class TestCase {

	@Test
	public void testA() {
		Context context = new Context(new ConcreteStateA());
		context.request();
		context.request();
		context.request();
		context.request();
	}
	
	@Test
	public void testB() {
		Context context = new Context(new ConcreteStateB());
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
