package com.extend;

public class BaseSub extends Base {

	int num = 11;
	public static ShowInfo  staticSonMember= new ShowInfo("���ྲ̬��Ա��Ա����");
	public ShowInfo si = new ShowInfo("�����Աʵ��");
	
	static{
		System.out.println("���ྲ̬��");
	}
	{
		System.out.println("���๹������");
	}
	public BaseSub() {
		// TODO Auto-generated constructor stub
		System.out.println("����Ĭ�Ϲ��캯��");
	}
	public BaseSub(String s) {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println("���๹�캯��"+s);
	}
	
	//���·�����������
	public void show(){
		
		System.out.println(this.getClass()+"  BaseSubs");
	}
	
	static void display(){
		System.out.println("BaseSub �ľ�̬����");
	}
	
	
	
}

