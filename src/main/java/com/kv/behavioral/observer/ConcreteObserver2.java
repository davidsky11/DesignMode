package com.kv.behavioral.observer;

// 具体观察者
public class ConcreteObserver2 implements Observer {

	@Override
	public void update() {
		System.out.println("I am observer 2, Subject's status changed.");
	}

}
