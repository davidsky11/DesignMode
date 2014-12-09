package com.kn.facade;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Facade f = new Facade(new SubSystem1(), new SubSystem2(), new SubSystem3());
		Client t = new Client(f);
		t.doSomething();
	}
}
