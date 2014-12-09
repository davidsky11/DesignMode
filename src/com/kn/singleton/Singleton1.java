package com.kn.singleton;

/**
 * Description:
 * 		节省内存，有利于Java GC
 * @author kevin
 *
 */
public class Singleton1 {
	
	private Singleton1() {
		
	}
	
	private static Singleton1 instance = new Singleton1();
	
	public static Singleton1 getInstance() {
		return instance;
	}
}
