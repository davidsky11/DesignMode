package com.kv.creative.prototype;

public class Prototype implements Cloneable {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Prototype(String name) {
		this.name = name;
	}
	
	public Prototype clone() {
		Prototype p = null;
		try {
			p = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
