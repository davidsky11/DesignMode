package com.kv.creative.builder;

// 抽象建造者
public abstract class Builder {

	public abstract void buildPart1();
	
	public abstract void buildPart2();
	
	public abstract void buildPart3();
	
	public abstract Product getResult();
}
