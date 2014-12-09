package com.kn.strategy;

public class FirstStrategy implements Strategy {

	@Override
	public void execute() {
		System.out.println("Called FirstStrategy.execute()");
	}

}
