package com.decorator;

public class Test   {
	
	public static void main(String[] args) {
		//客户指定了装饰者需要装饰的是哪一个类
		Component component = new DB_News(); //需要知道装饰的是那一个类
		Decorator decorator = new ConcreteDecortor_AddAmount(component);
		decorator = new ConcreteDecortor_AddRss(decorator);
		decorator.getListOfNews();
		
	}
	
}
