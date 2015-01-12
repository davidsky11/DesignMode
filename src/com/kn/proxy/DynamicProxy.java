package com.kn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	// 需要被代理类的引用 
	private Object object;

	// 通过构造方法传入引用  
	public DynamicProxy(Object object) {
		this.object = object;
	}

	// 定义一个工厂类，去生成动态代理  
	public Object getProxy() {
		// 通过Proxy类的newProxyInstance方法动态的生成一个动态代理，并返回它
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(), this);
	}

	// 重写的invoke方法，这里处理真正的方法调用
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object invoke = method.invoke(object, args);
		
		return invoke;
	}

}
