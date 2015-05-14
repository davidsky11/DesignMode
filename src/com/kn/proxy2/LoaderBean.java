package com.kn.proxy2;

import net.sf.cglib.proxy.Enhancer;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-14 下午2:40:46
 *
 * @author kevin
 * @version 1.1
 */
public class LoaderBean {

	private String loaderName;
	private int loaderValue;
	private PropertyBean propertyBean;
	
	public LoaderBean() {
		this.loaderName = "loaderA";
		this.loaderValue = 123;
		this.propertyBean = createPropertyBean();
	}
	
	@SuppressWarnings("static-access")
	protected PropertyBean createPropertyBean() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(PropertyBean.class);
		
		return (PropertyBean) enhancer.create(PropertyBean.class, new ClassLazyLoader());
	}

	public String getLoaderName() {
		return loaderName;
	}

	public int getLoaderValue() {
		return loaderValue;
	}

	public PropertyBean getPropertyBean() {
		return propertyBean;
	}

	public void setLoaderName(String loaderName) {
		this.loaderName = loaderName;
	}

	public void setLoaderValue(int loaderValue) {
		this.loaderValue = loaderValue;
	}

	public void setPropertyBean(PropertyBean propertyBean) {
		this.propertyBean = propertyBean;
	}
	
}
