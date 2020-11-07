package com.kv.structural.proxy.proxy2;

// 被代理类
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("request from real object.");
	}

	@Override
	public void print() {
		System.out.println("print from real object.");
	}

	@Override
	public void response() {
		System.out.println("response from real object.");
	}

}
