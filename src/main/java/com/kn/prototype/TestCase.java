package com.kn.prototype;

import org.junit.Test;

public class TestCase {
	
	@Test
	public void test0() {
		AbstractSpoon spoon1 = new SoupSpoon();
		AbstractSpoon spoon2 = (SoupSpoon) spoon1.clone();
		
		System.out.println(spoon2.getSpoonName());
	}
	
	@Test
	public void test1() {
		Prototype p = new Prototype("I am a prototype");
		Prototype p1 = p.clone();
		System.out.println(p1.getName());
	}

}
