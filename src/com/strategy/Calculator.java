package com.strategy;

import java.util.Observable;

/**
 * �����Ķ��󣬳��в��Խӿ�
 * ����ģʽ�ı��ʣ������㷨��ѡ��ʵ�֡�
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
