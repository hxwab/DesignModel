package com.strategy;

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
