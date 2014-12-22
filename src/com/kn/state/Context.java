package com.kn.state;

// 上下文
public class Context {

	private State state;
	
	public Context(ConcreteStateA s) {  
        setState(s);  
    } 
	
	public Context(ConcreteStateB s) {  
        setState(s);  
    } 
  
    public State getState() {  
        return state;  
    }  
  
    public void setState(State state) {  
        this.state = state;  
    }  
      
    public void request(){  
        state.handle(this);  
    } 
}
