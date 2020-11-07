package com.kv.behavioral.memento;

// 备忘录管理者
public class CareTaker {

	private Memento memento;
	
	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento menento) {
		this.memento = menento;
	}
}
