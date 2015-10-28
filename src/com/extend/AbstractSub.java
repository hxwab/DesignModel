package com.extend;

public class AbstractSub extends AbstractSuper {
	
	int num = 3;
	public void show(){
		
		System.out.println(this.getClass()+"  AbstractSub");
	}

}
