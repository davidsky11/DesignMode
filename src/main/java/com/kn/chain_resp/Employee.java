package com.kn.chain_resp;

public class Employee {

	public String name;

	private Supervisor supervisor;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	// some other properties
	public void addSalary(int added) {
		if (supervisor != null) {
			supervisor.addSalary(this, added);
		}
	}
}
