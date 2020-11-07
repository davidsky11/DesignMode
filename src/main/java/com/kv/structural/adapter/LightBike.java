package com.kv.structural.adapter;

public class LightBike implements Bike {

	@Override
	public void go() {
		System.out.println("Light Bike, it's so slow.");
	}

}
