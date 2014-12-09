package com.kn.decorator;

import com.kn.decorator.Target;

public class Decorator3 implements Target {

	private Target target;
	
	public Decorator3(Target target) {
		this.target = target;
	}
	
	@Override
	public void operation() {
		System.out.println("Before decorator 3");
		target.operation();
		System.out.println("After decorator 3");
	}

}
