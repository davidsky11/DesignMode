package com.kn.facade;

// 门面
public class Facade {
	
	private SubSystem1 sub1;
	private SubSystem2 sub2;
	private SubSystem3 sub3;
	
	public Facade(SubSystem1 sub1, SubSystem2 sub2, SubSystem3 sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public void doThis() {
		sub1.method1();
		sub2.method1();
		sub3.method1();
	}
	
	public void doThat() {
		sub1.method3();
		sub2.method3();
		sub3.method3();
	}
}
