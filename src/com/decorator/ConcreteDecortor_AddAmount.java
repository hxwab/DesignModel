package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDecortor_AddAmount extends Decorator {

	
	public ConcreteDecortor_AddAmount(Component component) {
		super(component);
	}
	
	public void addAmount(){
		System.out.println("给新闻添加人气");
	}

	@Override
	protected List<News> getListOfNews() {
		super.getListOfNews();
		addAmount();
		return new ArrayList<News>();
	}
	
	

}
