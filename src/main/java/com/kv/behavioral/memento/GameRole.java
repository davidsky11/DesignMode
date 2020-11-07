package com.kv.behavioral.memento;

public class GameRole {
	private int vitality;
	private int attack;
	private int defense;

	public GameRole() {
		this.vitality = 100;
		this.attack = 100;
		this.defense = 100;
	}

	public void showState() {
		System.out.println("vitality = " + vitality + "/nattack = " + attack
				+ "/ndefence = " + defense);
	}

	public RoleStateMemo save() {
		return new RoleStateMemo(vitality, attack, defense);
	}

	public void recover(RoleStateMemo m) {
		System.out.println("太菜了我，还好我存盘了，哈哈。");
		System.out.println("复活中......");
		this.vitality = m.getVitality();
		this.attack = m.getAttack();
		this.defense = m.getDefense();
		System.out.println("又复活了.");
	}

	public void fight() {
		System.out.println("与大Boss决战./n......");
		System.out.println("你输了, 你的生命，防御, 战斗力都将减为0.");
		this.vitality = 0;
		this.defense = 0;
		this.attack = 0;
	}
}