package com.proxy;
/**
 * 业务的具体实现，可以有多个不同的实现
 * @author csdc
 *
 */
public class RealSubject implements Subject {

	@Override
	public void doAction() {
		System.out.println("真实类");

	}

}
