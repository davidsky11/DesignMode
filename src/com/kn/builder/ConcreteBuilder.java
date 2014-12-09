package com.kn.builder;

// 具体建造者
public class ConcreteBuilder extends Builder {

	Product product = new Product();
	
	@Override
	public void buildPart1() {
		System.out.println("build part 1 for product.");
		product.setPart1("part1");
	}

	@Override
	public void buildPart2() {
		System.out.println("build part 2 for product.");
		product.setPart1("part2");
	}

	@Override
	public void buildPart3() {
		System.out.println("build part 3 for product.");
		product.setPart1("part3");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
