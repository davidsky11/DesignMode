package com.kv.creative.prototype;

public abstract class AbstractSpoon implements Cloneable {

	String spoonName;
	
	public void setSpoonName(String spoonName) {
		this.spoonName = spoonName;
	}
	
	public String getSpoonName() {
		return this.spoonName;
	}
	
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("AbstractSpoon is not cloneable");
		}
		
		return object;
	}
}
