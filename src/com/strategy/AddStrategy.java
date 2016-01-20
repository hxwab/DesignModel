package com.strategy;

public class AddStrategy implements ICalcStrategy {

	@Override
	public int calc(int x, int y) {
		return x+y;
	}

}
