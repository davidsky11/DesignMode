package com.kn.proxy0;

// 代理类
public class ProxySubject implements Subject {

	private Subject real;
	
	@Override
	public void request() {
		preRequest();
		if (real == null) {
			real = new RealSubject();
		}
		real.request();
		postRequest();
	}

	private void preRequest() {
		System.out.println("do something before request comes.");
	}
	
	private void postRequest() {
		System.out.println("do something after request done.");
	}
}
