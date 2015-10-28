package com.extend;

public class Base {

	int num = 1;
	String s ;
	public static ShowInfo  staticFatherMember= new ShowInfo("父类静态成员变量");
	public ShowInfo si = new ShowInfo("父类成员实例");
	
	
	static {
		
		System.out.println("父类静态块");
	}
	{
		System.out.println("父类构造块");
	}
	public Base() {
		// TODO Auto-generated constructor stub
		System.out.println("父类默认构造方法");
	}
	
     public  void Base(String s) {
		// TODO Auto-generated method stub
    	 System.out.println("父类构造块"+s);
	}
	public void show(){
		System.out.println(this.getClass()+"  Base");
	}
	
	public void result(){
		System.out.println(++num);
	}
	
	 static void display(){
		System.out.println("base静态方法");
	}

	

}
