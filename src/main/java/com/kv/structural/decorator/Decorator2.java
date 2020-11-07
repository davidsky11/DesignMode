package com.kv.structural.decorator;

public class Decorator2 implements Target {

	private Target target;
	
	public Decorator2(Target target) {
		this.target = target;
	}
	
	@Override
	public void operation() {
		System.out.println("Before decorator 2");
		target.operation();
		System.out.println("After decorator 2");
	}

}
