package com.kn.command;

public class ConcreteCommand1 implements Command {

	private Receiver receiver;
	
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		System.out.println("This is concrete command 1, the request will be executed by recriver.");  
        receiver.action();  
	}
	
}
