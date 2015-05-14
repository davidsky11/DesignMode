package com.kn.proxy2;

import net.sf.cglib.proxy.Enhancer;

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
 * @date 2015-5-14 下午2:49:05
 * 
 * @author kevin
 * @version 1.1
 */
public class DispatcherBean {

	private String name;
	private String value;
	private PropertyBean propertyBean;

	public DispatcherBean() {
		this.name = "DispatcherBean";
		this.value = "abc";
		this.propertyBean = createDispatcherBean();
	}

	@SuppressWarnings("static-access")
	protected PropertyBean createDispatcherBean() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(PropertyBean.class);
		return (PropertyBean) enhancer.create(PropertyBean.class,
				new ClassDispatcher());
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public PropertyBean getPropertyBean() {
		return propertyBean;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setPropertyBean(PropertyBean propertyBean) {
		this.propertyBean = propertyBean;
	}

}
