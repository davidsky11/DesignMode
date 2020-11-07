package com.kv.structural.bridge;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		AbstractRoad speedWay = new SpeedWay();
		speedWay.aCar = new Car();
		speedWay.run();
		
		speedWay.aCar = new Bus();
		speedWay.run();
		
		AbstractRoad street = new Street();
		street.aCar = new Car();
		street.run();
		
		street.aCar = new Bus();
		street.run();
	}
}
