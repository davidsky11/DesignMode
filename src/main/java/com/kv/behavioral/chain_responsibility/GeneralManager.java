package com.kv.behavioral.chain_responsibility;

public class GeneralManager implements Supervisor {

	private Supervisor successor;

	public GeneralManager(Supervisor s) {
		this.successor = s;
	}

	@Override
	public void addSalary(Employee e, int added) {
		if (added < 800) {
			System.out.println("General Leader: " + e.name + " want to add "
					+ added + " salary, I can process it, done!");
		} else if (successor != null) {
			System.out.println("General Leader: " + e.name + " want to add "
					+ added
					+ " salary, I can't process it, but my supervisor can do!");
			successor.addSalary(e, added);
		}
	}

}
