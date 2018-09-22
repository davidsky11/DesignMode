package com.kn.memento;

// 备忘录
public class Memento {

	private String state;
	
	public String getState() {
		return state;
	}
	
	public Memento(String state) {
		this.state = state;
	}
}
