package com.template;

public abstract class Template {
	
	protected char c;
	
	public Template(char c) {
		this.c = c;
	}
	
	
	abstract protected  void print(int len);
	
	abstract protected void printMsg(String msg);
	
	public final void display(String msg){
		
		int len = msg.length()+2;
		print(len);
		printMsg(msg);
		print(len);
		
	}

}
