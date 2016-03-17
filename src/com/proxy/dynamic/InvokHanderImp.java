package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvokHanderImp implements InvocationHandler {

	
	private ElectricCar car;
	
	public InvokHanderImp(ElectricCar car) {
		this.car=car;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		
		System.out.println("you are going to invoke " +method.getName());
		method.invoke(car, null);
		System.out.println(method.getName()+" invoke has been finshed");
		
		return null;
	}

}
