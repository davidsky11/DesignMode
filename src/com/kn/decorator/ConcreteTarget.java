package com.kn.decorator;

// 被装饰的类
public class ConcreteTarget implements Target {

	@Override
	public void operation() {
		System.out.println("Original operation.");
	}

}
