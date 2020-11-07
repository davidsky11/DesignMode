package com.kv.structural.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

	// Flyweight pool
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<Object, Flyweight>();
	
	public Flyweight getFlyweight(Object key) {
		Flyweight flyweight = (Flyweight) flyweights.get(key); 
		if (flyweight == null) {
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight();
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}
}
