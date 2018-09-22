package com.kn.decorator;

import org.junit.Test;

public class TestCase {

	@Test
	public void test0() {
		Target t = new ConcreteTarget();
		Decorator1 obj = new Decorator1(new Decorator2(new Decorator3(t)));
		obj.operation();
	}
	
	@Test
	public void test1() {
		Soldier s = new ChineseSoldier();
		
		Soldier sprcialSoldier = new NightVisionSoldier(new FlySoldier(new ScoutSoldier(s)));
		System.out.println(sprcialSoldier.getAbility());
	}
}
