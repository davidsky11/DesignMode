package com.kv.structural.composite;

import org.junit.Test;

public class TestCase {  
	
	@Test
    public void test() {  
        Component root = new Composite("D://");  
        Component programs = new Composite("Program Files");  
        programs.add(new Leaf("360杀毒"));  
        programs.add(new Leaf("Office 2007"));  
        programs.add(new Leaf("Movie Maker"));  
        Component windows = new Composite("Windows");  
        windows.add(new Leaf("system"));  
        windows.add(new Leaf("system32"));  
        windows.add(new Leaf("temp"));  
        Component autoexec = new Leaf("AUTOEXEC.BAT");  
        Component boot = new Leaf("boot.ini");  
        root.add(programs);  
        root.add(windows);  
        root.add(autoexec);  
        root.add(boot);  
        root.display(0);  
    }  
}  
