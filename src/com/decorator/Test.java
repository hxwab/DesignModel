package com.decorator;

public class Test   {
	
	public static void main(String[] args) {
		
		Component component = new DB_News();
		Decorator decorator = new ConcreteDecortor_AddAmount(component);
		decorator = new ConcreteDecortor_AddRss(decorator);
		decorator.getListOfNews();
		
	}
	
}
