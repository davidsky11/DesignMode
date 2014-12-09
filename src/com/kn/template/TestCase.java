package com.kn.template;

import org.junit.Test;

// 测试用例
public class TestCase {

	@Test
	public void test() {
		Context c = new Context(new Concrete());
		c.process();
	}	
}
