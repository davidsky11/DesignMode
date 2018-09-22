package com.kn.mediator;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		ConcreteMediator mediator = new ConcreteMediator();  
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);  
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);  
        mediator.setColleague1(c1);  
        mediator.setColleague2(c2);  
        c1.send("吃了吗？");  
        c2.send("没有， 你要请客吗？"); 
	}
}
