package com.kn.composite;

// 叶子节点
public class Leaf implements Component {

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {
		System.out.println("leaf node can't add sub component.");  
	}

	@Override
	public void remove(Component c) {
		System.out.println("leaf node can't remove sub component.");
	}

	@Override
	public void display(int depth) {
		String sketon = "";  
        for(int i=0; i<depth; i++){  
            sketon += "-";  
        }  
        System.out.println(sketon + name);
	}

	
}
