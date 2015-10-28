package com.extend;

public class BaseSub extends Base {

	int num = 11;
	public static ShowInfo  staticSonMember= new ShowInfo("子类静态成员成员变量");
	public ShowInfo si = new ShowInfo("子类成员实例");
	
	static{
		System.out.println("子类静态块");
	}
	{
		System.out.println("子类构造代码块");
	}
	public BaseSub() {
		// TODO Auto-generated constructor stub
		System.out.println("子类默认构造函数");
	}
	public BaseSub(String s) {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println("子类构造函数"+s);
	}
	
	//已下方法均被覆盖
	public void show(){
		
		System.out.println(this.getClass()+"  BaseSubs");
	}
	
	static void display(){
		System.out.println("BaseSub 的静态方法");
	}
	
	
	
}

