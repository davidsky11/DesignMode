package com.kn.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	// 把左右两个表达式运算的结果加起来  
    public int interprete(HashMap<String, Integer> var) {  
        return super.left.interprete(var) - super.right.interprete(var);  
    }  
}
