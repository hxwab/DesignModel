package com.flyweight;

public class FlyWeightPattern {
	
	private  FlyWeightFactory factory ; 
	
	private FlyWeight f1;
	private FlyWeight f2;
	private FlyWeight f3;
	private FlyWeight f4;
	
	public static void main(String[] args) {
		FlyWeightPattern f = new FlyWeightPattern();
		f.show();
		f.test0();
	}
	

	public  FlyWeightPattern() {
		factory = FlyWeightFactory.getInstance();
		f1 = factory.getFlyWeight("goole");
		f2 = factory.getFlyWeight("goole");
		f3 = factory.getFlyWeight("goole");
		f4 = factory.getFlyWeight("baidu");
	}
	
	public void show(){
		f1.operation();
		f2.operation();
		f3.operation();
		f4.operation();
		System.out.println("size: "+factory.getFlyWeightSize());
	}
	
	
	public void test0(){
		
		while(true){
			factory = FlyWeightFactory.getInstance();
			System.out.println(factory.hashCode());
		}
	}
	
	public void test(){
		
		for(int i=0;i<10;i++)
		new Thread(new Runnable() {
			
			@Override
			public void run() {

				while(true){
					factory = FlyWeightFactory.getInstance();
					System.out.println(factory.hashCode());
				}
			}
		},"thread"+i).start();
		
	}
	
	
}
