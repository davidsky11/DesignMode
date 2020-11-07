package com.kv.structural.proxy.proxy2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-13 下午4:29:08
 *
 * @author kevin
 * @version 1.1
 */
public class ClassMethodInterceptor implements MethodInterceptor /* 方法拦截类 */ {

	private Enhancer enhancer = new Enhancer();			// 增强类
	
	public Object getProxy(Class<?> clazz) {
		// 设置需要创建子类的类
		enhancer.setSuperclass(clazz);
//		enhancer.setCallback(this);
		
		ClassCallbackFilter filter= new ClassCallbackFilter();
		enhancer.setCallbackFilter(filter);
		
		Callback interceptor = this;
		Callback noOp = NoOp.INSTANCE;
		Callback fixedValue = new ClassFixedValue();
		Callback[] callbacks = new Callback[] {interceptor, noOp, fixedValue};
		enhancer.setCallbacks(callbacks);
		
		// 通过字节码技术动态创建子类实例
		return enhancer.create();
	}

	/**
	 * 拦截父类所有方法的调用
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		preRequest();				// 拦截前
		
		// 通过代理类调用父类中的方法
		Object result = proxy.invokeSuper(obj, args);
		
		postRequest();				// 拦截后
		return result;
	}
	
	private void preRequest() {
		System.out.println("do something before request comes.");
	}
	
	private void postRequest() {
		System.out.println("do something after request done.");
	}
	
}
