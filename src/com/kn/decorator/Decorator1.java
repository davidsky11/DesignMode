package com.kn.decorator;

import com.kn.decorator.Target;

public class Decorator1 implements Target {

	private Target target;
	
	public Decorator1(Target target) {
		this.target = target;
	}
	
	@Override
	public void operation() {
		System.out.println("Before decorator 1");
		target.operation();
		System.out.println("After decorator 1");
	}

}
