package com.command;

public class Receiver {
	
	private Integer muttonNums;
	
	private Integer  chckenWingNums;
	
	
	public Receiver(Integer muttonNums, Integer chckenWingNums) {
		this.muttonNums = muttonNums;
		this.chckenWingNums = chckenWingNums;
	}

	public void makeMutton(){
		System.out.println("¿¾ÑòÈâ´®"+muttonNums);
	}
	
	public void makeChickenWing(){
		System.out.println("¿¾¼¦³á"+chckenWingNums);
	}

}
