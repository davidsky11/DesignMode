package com.kn.proxy2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: 
 * 		CGLib有三种回调方式：
 * 		1、MethodInterceptor：方法拦截器
 * 		2、NoOp.INSTANCE:这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截
 * 		3、FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定的值。</p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-14 下午2:19:25
 *
 * @author kevin
 * @version 1.1
 */
public class ClassCallbackFilter implements CallbackFilter {

	@Override
	public int accept(Method method) {
		if ("resquest".equals(method.getName())) {
			return 0;
		} else if ("print".equals(method.getName())) {
			return 1;
		} else if ("response".equals(method.getName())) {
			return 2;
		}
		
		return 1;
		// return值为被代理类的各个方法在回调数组Callback[]中的位置索引。
	}

}
