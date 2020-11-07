package com.kv.structural.bridge;

public class Bus extends AbstractCar {

	public void run() {
		super.run();
		System.out.print("公交车");
	}
}
