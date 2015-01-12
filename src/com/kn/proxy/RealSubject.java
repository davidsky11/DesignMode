package com.kn.proxy;

// 被代理类
public class RealSubject implements Subject, Subject1 {

	@Override
	public void request() {
		System.out.println("message from real object.");
	}

	@Override
	public void request1() {
		System.out.println("message from real object1.");
	}

}
