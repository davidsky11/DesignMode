package com.kv.behavioral.command;

public class ConcreteCommand2 implements Command {

	private Receiver receiver;
	
	public ConcreteCommand2(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		System.out.println("This is concrete command 2, the request will be executed by recriver.");  
        receiver.action();  
	}
	
}
