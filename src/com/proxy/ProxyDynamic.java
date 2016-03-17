package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * http://www.360doc.com/content/14/0801/14/1073512_398598312.shtml
 * @author csdc
 *
 */
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
