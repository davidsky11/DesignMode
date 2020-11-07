package com.kv.structural.flyweight;

public class Artist {

	// 内部状态
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Artist(String name) {
		this.name = name;
	}
	
}
