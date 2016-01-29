package com.decorator;

import java.util.List;
/**
 * 
 *   装饰者模式的问题及解决:用装饰者实例化组件时,将增加代码的复杂度,一旦应用了装饰者模式,不只需要实例化组件,
 *   还要把组件包装进装饰者,而这样的装饰者有多少个是不确定的。这里可以应用工厂模式来实例化组件来简化操作。
 * @author csdc
 *
 */
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
