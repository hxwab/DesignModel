package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDynamic  implements Subject,InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}

}
