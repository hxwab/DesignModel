package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDecortor_AddRss extends Decorator {

	public ConcreteDecortor_AddRss(Component component) {
		super(component);
	}

	public void addRss(){
		System.out.println("����������Rss");
	}
	@Override
	protected List<News> getListOfNews() {
		super.getListOfNews();
		addRss();
		return  new ArrayList<News>();
	}

	
}
