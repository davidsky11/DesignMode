package com.kv.behavioral.memento;

public class RoleStateMemo {
	private int vitality;
	private int attack;
	private int defense;

	public RoleStateMemo(int v, int a, int d) {
		this.vitality = v;
		this.attack = a;
		this.defense = d;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

}