package com.kn.bridge;

public class SpeedWay extends AbstractRoad {

	public void run() {
		super.run();
		aCar.run();
		System.out.println("在高速公路行驶");
	}
}
