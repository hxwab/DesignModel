package com.strategy;

import java.util.Observable;

/**
 * 上下文对象，持有策略接口
 * 策略模式的本质：分离算法，选择实现。
 * @author csdc
 *
 */
public class Calculator {

	private int x;
	
	private int y;
	
	private ICalcStrategy strategy = null;

	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	 Observable
	public Calculator(int x, int y, ICalcStrategy strategy) {
		this(x,y);
		this.strategy = strategy;
	}
	
	public int calc(int x,int y){
		return x+y;
	}
	
	public int result(){
		if(strategy!=null){
			return strategy.calc(x, y);
		}
		return calc(x, y);
	}
	
}
