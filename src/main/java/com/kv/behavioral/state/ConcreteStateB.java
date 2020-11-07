package com.kv.behavioral.state;

// 状态2
public class ConcreteStateB implements State {

	String msg = "state b";
	
	@Override
	public void handle(Context context) {
		System.out.println("Current state is " + msg + ", the state will be changed.");  
        context.setState(new ConcreteStateA()); 
	}

}
