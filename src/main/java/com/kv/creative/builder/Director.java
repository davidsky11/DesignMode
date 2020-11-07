package com.kv.creative.builder;

// 指挥者
public class Director {

	public void construct(Builder b) {
		b.buildPart1();
		b.buildPart2();
		b.buildPart3();
	}
}
