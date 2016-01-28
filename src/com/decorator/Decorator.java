package com.decorator;

import java.util.List;

public class Decorator extends Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}


	@Override
	protected List<News> getListOfNews() {
		
		return component.getListOfNews();
	}

}
