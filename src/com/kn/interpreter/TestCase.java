package com.kn.interpreter;

import java.util.HashMap;
import org.junit.Test;

// 测试用例
public class TestCase {

	@Test
	public void test() {
		//构造运算元素的值列表  
        HashMap<String, Integer> ctx = new HashMap<String, Integer>();  
        ctx.put("a", 10);  
        ctx.put("b", 20);  
        ctx.put("c", 30);  
        ctx.put("d", 40);  
        ctx.put("e", 50);  
        ctx.put("f", 60);  
        Calculator calc = new Calculator("a+b-c");  
        int result = calc.run(ctx);  
        System.out.println("Result of a+b-c: " + result);  
        calc = new Calculator("d-a-b+c");  
        result = calc.run(ctx);  
        System.out.println("Result of d-a-b+c: " + result); 
	}
}
