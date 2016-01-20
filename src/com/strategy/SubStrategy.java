package com.strategy;

public class SubStrategy implements ICalcStrategy {

	@Override
	public int calc(int x, int y) {
		return x-y;
	}

}
