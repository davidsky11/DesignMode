package com.kn.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator m) {
		super(m);
	}

	public void send(String msg) {
		System.out.println("Colleague1 sends msg: " + msg);
		mediator.send(msg, this);
	}

	public void readMsg(String msg) {
		System.out.println("Colleague1 get msg: " + msg);
	}
}
