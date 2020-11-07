package com.kv.structural.proxy.proxy2;

import net.sf.cglib.proxy.Dispatcher;

/**
 * <p>
 * Title: FSVM System
 * </p>
 * 
 * <p>
 * Description:
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2015
 * </p>
 * 
 * <p>
 * Company: Foxconn
 * </p>
 * 
 * @date 2015-5-14 下午2:50:10
 * 
 * @author kevin
 * @version 1.1
 */
public class ClassDispatcher implements Dispatcher {

	@Override
	public Object loadObject() throws Exception {
		System.out.println("Dispatcher loadObject ...");
		PropertyBean object = new PropertyBean();
		object.setPropertyName("PropertyBeanName!");
		object.setPropertyValue(1);
		return object;
	}

}
