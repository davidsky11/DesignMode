package com.kn.proxy.proxy2;

import net.sf.cglib.proxy.LazyLoader;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-14 下午2:39:13
 *
 * @author kevin
 * @version 1.1
 */
public class ClassLazyLoader implements LazyLoader {

	@Override
	public Object loadObject() throws Exception {
		System.out.println("LazyLoader loadObject()...");
		PropertyBean bean = new PropertyBean();
		bean.setPropertyName("lazy-load object propertyName...");
		bean.setPropertyValue(11);
		return bean;
	}

}
