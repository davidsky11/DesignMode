package com.kv.structural.bridge;

public class Car extends AbstractCar {

	public void run() {
		super.run();
		System.out.print("小汽车");
	}
}
