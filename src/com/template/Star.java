package com.template;

public class Star  extends Template{

	public Star(char c) {
		super(c);
	}
	
	@Override
	protected void print(int len) {
		for(int i=0;i<len;i++){
			System.out.print(c);
		}
		System.out.println("");
	}

	@Override
	protected void printMsg(String msg) {

		System.out.println(msg);
	}

}
