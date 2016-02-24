package com.proxy;

public class RealSubject implements Subject {

	@Override
	public void doAction() {
		System.out.println("真实类");

	}

}
