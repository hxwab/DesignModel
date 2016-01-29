package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDecortor_AddAmount extends Decorator {

	
	public ConcreteDecortor_AddAmount(Component component) {
		super(component);
	}
	
	public void addAmount(){
		System.out.println("�������������");
	}
/**
 * 装饰模式：在不改变接口的前提下，动态扩展对象的功能
 */
	@Override
	protected List<News> getListOfNews() {
		super.getListOfNews();
		addAmount();
		return new ArrayList<News>();
	}
	
	

}
