package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 反射拿到obj,代理invoke（）方法
 * @author csdc
 *
 */
public class InvokHanderImp implements InvocationHandler {

	
	private Object targetObject;
	
	public InvokHanderImp(Object targetObject) {
		this.targetObject=targetObject;
	}
	
	public Object creatProxy(){
		
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), 
				targetObject.getClass().getInterfaces(), this);
		
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		
		System.out.println("you are going to invoke " +method.getName());
		method.invoke(targetObject, args);
		System.out.println(method.getName()+" invoke has been finshed");
		
		return null;
	}

}
