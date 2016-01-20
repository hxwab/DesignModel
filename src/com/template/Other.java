package com.template;

public class Other  extends Template {

	public Other(char c) {
		super(c);
	}
	
	
	@Override
	protected void print(int len) {
		for(int i =0;i<5;i++){
			for(int j=i;j<len-i;j++){
				System.out.print(c);
			}
			System.out.println("");
		}
		
	}

	@Override
	protected void printMsg(String msg) {
		
		System.out.println(msg);
	}

}
