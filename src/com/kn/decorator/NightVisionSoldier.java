package com.kn.decorator;

public class NightVisionSoldier implements Soldier {

	private Soldier soldier;
	
	public NightVisionSoldier(Soldier soldier) {
		this.soldier = soldier;
	}
	
	@Override
	public String getAbility() {
		return soldier.getAbility() + "night vision ";
	}

}
