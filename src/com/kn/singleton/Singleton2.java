package com.kn.singleton;

/**
 * Description:
 * 		节省内存，有利于Java GC
 * @author kevin
 *
 */
public class Singleton2 {

	private static Singleton2 instance = null;
	
	public static synchronized Singleton2 getInstance() {
		
		// 不用每次都生成对象，只是第一次使用时生成实例，提高效率
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
