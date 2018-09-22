package com.kn.chain_resp;

public class TeamLeader implements Supervisor {

	private Supervisor successor;

	public TeamLeader(Supervisor s) {
		this.successor = s;
	}

	@Override
	public void addSalary(Employee e, int added) {
		if (added < 100) {
			System.out.println("Team Leader: " + e.name + " want to add "
					+ added + " salary, I can process it, done!");
		} else if (successor != null) {
			System.out.println("Team Leader: " + e.name + " want to add "
					+ added
					+ " salary, I can't process it, but my supervisor can do!");
			successor.addSalary(e, added);
		}
	}

}
