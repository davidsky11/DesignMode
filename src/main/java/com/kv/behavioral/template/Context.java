package com.kv.behavioral.template;

// 上下文
public class Context {

	private Template t;
	
	public Context(Template t) {
		this.t = t;
	}
	
	public void process() {
		t.process();
	}

}
