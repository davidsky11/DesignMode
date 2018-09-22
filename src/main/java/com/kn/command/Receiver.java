package com.kn.command;

public class Receiver {

	private String name;
	
	public Receiver(String name) {
		this.name = name;
	}
	
	public void action() {
		System.out.println("I am recriver " + name + ", action executed."); 
	}
	
}
