package com.kn.singleton;

/**
 * Description:
 * 		懒汉模式（延迟加载方式）
 *
 * 	缺点：
 * 	    并发环境下加锁，竞争激烈的场合对性能可能产生一定的影响。
 * @author kevin
 *
 */
public class Singleton2 {

	private static Singleton2 instance = null;

	// 同步代码块，高并发下效率低
	public static synchronized Singleton2 getInstance() {
		
		// 不用每次都生成对象，只是第一次使用时生成实例，提高效率
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
