package com.kn.command;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Command c1 = new ConcreteCommand1(new Receiver("1"));  
        Command c2 = new ConcreteCommand2(new Receiver("2"));  
        Invoker invoker = new Invoker();  
        invoker.setCommand(c1);  
        invoker.executeCommand();  
        invoker.setCommand(c2);  
        invoker.executeCommand();
	}
}
