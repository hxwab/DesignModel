package com.template;

public class Test {
	
	public static void main(String[] args) {
		Template t= new Star('*');
		t.display("hello");
		
		t= new Star('#');
		t.display("world");
		
		t = new Other('*');
		t.display("hello world");
	}
	

}
