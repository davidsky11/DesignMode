package com.kn.memento;

// 备忘录发起人，即需要备忘的对象
public class Originator {

	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemo(){  
        return new Memento(state);  
    }
	
    public void recover(Memento m){  
        this.state = m.getState();  
    }  
    
    public void show(){  
        System.out.println("state = " + state);  
    } 
}
