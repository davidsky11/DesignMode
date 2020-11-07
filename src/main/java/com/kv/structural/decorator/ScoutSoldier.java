package com.kv.structural.decorator;

public class ScoutSoldier implements Soldier {

	private Soldier soldier;
	
	public ScoutSoldier(Soldier soldier) {
		this.soldier = soldier;
	}
	
	@Override
	public String getAbility() {
		return soldier.getAbility() + "scout ";
	}

}
