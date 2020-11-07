package com.kv.behavioral.chain_responsibility;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Employee e = new Employee("Jack");  
        Boss b = new Boss();  
        GeneralManager gm = new GeneralManager(b);  
        DeptManager dm = new DeptManager(gm);  
        TeamLeader tl = new TeamLeader(dm);  
        e.setSupervisor(tl);  
        e.addSalary(1200);  
	}
}
