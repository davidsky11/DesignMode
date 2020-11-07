package com.kv.behavioral.command;

public class Invoker {

	private Command command;
	
	//当然更好的作法是维护一个命令队列  
    //这样就可以实现对命令进行排序，撤销命令等操作。  
    //List commands = new ArrayList();  
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		this.command.execute();
	}
}
