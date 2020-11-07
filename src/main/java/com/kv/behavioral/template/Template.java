package com.kv.behavioral.template;

// 模板
public abstract class Template {

	private void step1() {
		System.out.println("This is the first step.");
	}
	
	protected abstract void step2();
	
	private void step3() {
		System.out.println("This is the third step.");
	}
	
	public void process() {
		step1();
		step2();
		step3();
	}
}
