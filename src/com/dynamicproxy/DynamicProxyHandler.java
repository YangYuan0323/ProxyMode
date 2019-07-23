package com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	private Object object;
	
	public DynamicProxyHandler(Object object){
		this.object = object;
	}
	

	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {
		System.out.println("��ǰ׼��");
		Object result = method.invoke(object, arg);
		System.out.println("�򷿺�װ��");
		return result;
	}

}
