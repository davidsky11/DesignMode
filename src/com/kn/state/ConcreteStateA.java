package com.kn.state;

// 状态1
public class ConcreteStateA implements State {

	String msg = "state a";
	
	@Override
	public void handle(Context context) {
		System.out.println("Current state is " + msg + ", the state will be changed.");  
        context.setState(new ConcreteStateB()); 
	}

}
