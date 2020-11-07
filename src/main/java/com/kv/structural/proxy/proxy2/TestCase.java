package com.kv.structural.proxy.proxy2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.InterfaceMaker;

import org.junit.Test;

// 测试用例
public class TestCase {

	/*
	 * 方法拦截MethodInterceptor
	 * 回调过滤CallbackFilter
	 */
	@Test
	public void test1() {
		ClassMethodInterceptor proxy = new ClassMethodInterceptor();
		RealSubject real = (RealSubject) proxy.getProxy(RealSubject.class);
		
		real.request();
		real.print();
		real.response();
	}
	
	/*
	 * 延迟加载LazyLoader
	 */
	@Test
	public void test2() {
		LoaderBean loader=new LoaderBean();  
		System.out.println(loader.getLoaderName());  
		System.out.println(loader.getLoaderValue());  
		PropertyBean propertyBean=loader.getPropertyBean();//访问延迟加载对象  
		System.out.println(propertyBean.getPropertyName());  
		System.out.println(propertyBean.getPropertyValue());  
		System.out.println("after...");  
		//当再次访问延迟加载对象时,就不会再执行回调了  
		System.out.println(propertyBean.getPropertyName());  
	}
	/*
	 * 改进版延迟加载Dispatcher
	 */
	@Test
	public void test3() {
		DispatcherBean dispatcherBean=new DispatcherBean();  
		System.out.println(dispatcherBean.getName());  
		System.out.println(dispatcherBean.getValue());  
		  
		PropertyBean pb=dispatcherBean.getPropertyBean();  
		System.out.println(pb.getPropertyName());  
		//在每次访问时都要进行回调  
		System.out.println(pb.getPropertyValue());  
	}
	
	/*
	 * 接口生成器
	 */
	@Test
	public void test4() {
		InterfaceMaker im = new InterfaceMaker();
		im.add(RealSubject.class);
		Class<?> interfaceObj = im.create();
		System.out.println(interfaceObj.isInterface());
		System.out.println(interfaceObj.getName());
		
		Method[] methods = interfaceObj.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
