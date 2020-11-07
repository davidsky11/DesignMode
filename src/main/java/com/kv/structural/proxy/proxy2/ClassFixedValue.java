package com.kv.structural.proxy.proxy2;

import net.sf.cglib.proxy.FixedValue;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-14 下午2:35:40
 *
 * @author kevin
 * @version 1.1
 */
public class ClassFixedValue implements FixedValue {

	@Override
	public Object loadObject() throws Exception {
		System.out.println("ClassFixedValue loadObject...");
		Object obj = 999;
		return obj;
	}

}
