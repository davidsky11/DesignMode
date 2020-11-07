package com.kv.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// 具体主题
public class ConcreteSubject implements Subject {

	public List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update();
		}
	}

}
