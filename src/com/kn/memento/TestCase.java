package com.kn.memento;

import org.junit.Test;

// 测试用例
public class TestCase {

	@Test
	public void test0() {
		Originator o = new Originator();  
        o.setState("On");  
        o.show();  
        CareTaker c = new CareTaker();  
        c.setMemento(o.createMemo());  
        o.setState("Off");  
        o.show();  
        o.recover(c.getMemento());  
        o.show();
	}
	
	@Test
	public void test1() {
		GameRole role = new GameRole();  
        role.showState();  
        RoleMemoManager manager = new RoleMemoManager();  
        manager.setM(role.save());  
        role.fight();  
        role.showState();  
        role.recover(manager.getM());  
        role.showState();  
	}
}
