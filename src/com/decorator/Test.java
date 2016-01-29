package com.decorator;

public class Test   {
	
	public static void main(String[] args) {
		
		Component component = new DB_News(); //需要知道装饰的是那一个类
		Decorator decorator = new ConcreteDecortor_AddAmount(component);
		decorator = new ConcreteDecortor_AddRss(decorator);
		decorator.getListOfNews();
		
	}
	
}
