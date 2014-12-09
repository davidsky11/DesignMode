package com.kn.chain_resp;

public class Boss implements Supervisor {

	public Boss() {
		
	}

	@Override
	public void addSalary(Employee e, int added) {
		// boss具有最终处理权限, 但是他打官腔  
        System.out.println("Boss: I will process it soon."); 
	}
	
}
