package com.kn.builder;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
//		Product p = new Product();
		Builder b = new ConcreteBuilder();
		Director d = new Director();
		
		d.construct(b);
	}
}
