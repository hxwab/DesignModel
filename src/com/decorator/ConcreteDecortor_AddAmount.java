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

	@Override
	protected List<News> getListOfNews() {
		super.getListOfNews();
		addAmount();
		return new ArrayList<News>();
	}
	
	

}
