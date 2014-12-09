package com.kn.decorator;

public class FlySoldier implements Soldier {

	private Soldier soldier;
	
	public FlySoldier(Soldier soldier) {
		this.soldier = soldier;
	}
	
	@Override
	public String getAbility() {
		return soldier.getAbility() + "fly ";
	}

}
