package com.extend;

public class Base {

	int num = 1;
	String s ;
	public static ShowInfo  staticFatherMember= new ShowInfo("���ྲ̬��Ա����");
	public ShowInfo si = new ShowInfo("�����Աʵ��");
	
	
	static {
		
		System.out.println("���ྲ̬��");
	}
	{
		System.out.println("���๹���");
	}
	public Base() {
		// TODO Auto-generated constructor stub
		System.out.println("����Ĭ�Ϲ��췽��");
	}
	
     public  void Base(String s) {
		// TODO Auto-generated method stub
    	 System.out.println("���๹���"+s);
	}
	public void show(){
		System.out.println(this.getClass()+"  Base");
	}
	
	public void result(){
		System.out.println(++num);
	}
	
	 static void display(){
		System.out.println("base��̬����");
	}

	

}
