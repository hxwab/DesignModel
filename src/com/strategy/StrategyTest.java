package com.strategy;
/**
 * 策略模式，实现算法的切换
 * @author csdc
 * 定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换
 *
 */
public class StrategyTest {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator(2, 3);
		System.out.println(c.result());
		
		
		c= new Calculator(2, 3, new AddStrategy());
		System.out.println(c.result());
		
		
		c= new Calculator(2, 3, new SubStrategy());
		System.out.println(c.result());
		
		c=new Calculator(2, 3, new ICalcStrategy() {
			
			@Override
			public int calc(int x, int y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		});
		
		System.out.println(c.result());
	}
	

}
