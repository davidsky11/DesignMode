package com.kn.state;

import org.junit.Test;

// 测试用例
public class TestCase {

	@Test
	public void test() {
		Context context = new Context(new ConcreteStateA());
		context.request();
		context.request();
	}
}
