package com.kv.structural.adapter;

// 摩托车适配器
public class MotoAdapter implements Bike {

	private Moto moto;
	
	public MotoAdapter(Moto moto) {
		this.moto = moto;
	}
	
	@Override
	public void go() {
		moto.go();
	}

}
