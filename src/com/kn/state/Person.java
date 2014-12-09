package com.kn.state;

public class Person {
	public void doSomething(int time){
		if(time>8&&time<=9){
			System.out.println("I am on bus, suffering...");
		}
		else if(time>9&&time<=12){
			System.out.println("I am working.");
		}
		else if(time>12&&time<=13){
			System.out.println("I am having lunch.");
		}
		else if(time>13&&time<=18){
			System.out.println("I am working.");
		}
		else if(time>18&&time<=23){
			System.out.println("Oh yeah, going home.");
		}
		else{
			System.out.println("Zzz Zzz Zzz...");//打鼾
		}
	}
}
