package com.kn.observer;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Subject s = new ConcreteSubject();
		s.attach(new ConcreteObserver1());
		s.attach(new ConcreteObserver2());
		s.notifyObserver();
	}
}
