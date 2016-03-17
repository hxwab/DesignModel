package com.proxy.dynamic;

public class ElectricCar implements Rechargeable, Vehicle {

	@Override
	public void drive() {

		System.out.println("正在行驶");
	}

	@Override
	public void recharge() {

		System.out.println("正在充电");
	}

}
