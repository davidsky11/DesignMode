package com.kn.composite;

// 公共接口
public interface Component {

	public void add(Component c);
	
	public void remove(Component c);
	
	public void display(int depth);
	
}
