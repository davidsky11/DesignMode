package com.kv.structural.composite;

import java.util.ArrayList;
import java.util.List;

// 枝节点
public class Composite implements Component {

	List<Component> children = new ArrayList<Component>();

	private String name;
	
	public Composite(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String sketon = "";  
        for(int i=0; i<depth; i++){  
            sketon += "-";  
        }  
        System.out.println(sketon + name);  
        for(Component c : children){  
            c.display(depth + 2);  
        } 
	}
}
