package com.kn.observer;

// 具体观察者
public class ConcreteObserver1 implements Observer {

	@Override
	public void update() {
		System.out.println("I am observer 1, Subject's status changed.");
	}

}
