package com.kv.structural.proxy.proxy2;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-14 下午2:40:03
 *
 * @author kevin
 * @version 1.1
 */
public class PropertyBean {

	private String propertyName;
	private int propertyValue;
	
	public String getPropertyName() {
		return propertyName;
	}
	public int getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public void setPropertyValue(int propertyValue) {
		this.propertyValue = propertyValue;
	}
	
}
