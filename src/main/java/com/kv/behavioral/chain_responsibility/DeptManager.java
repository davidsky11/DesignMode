package com.kv.behavioral.chain_responsibility;

public class DeptManager implements Supervisor {

	private Supervisor successor;

	public DeptManager(Supervisor s) {
		this.successor = s;
	}

	@Override
	public void addSalary(Employee e, int added) {
		if (added < 500) {
			System.out.println("Dept Leader: " + e.name + " want to add "
					+ added + " salary, I can process it, done!");
		} else if (successor != null) {
			System.out.println("Dept Leader: " + e.name + " want to add "
					+ added
					+ " salary, I can't process it, but my supervisor can do!");
			successor.addSalary(e, added);
		}
	}

}
