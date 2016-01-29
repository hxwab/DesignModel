package com.decorator;

import java.util.List;
/**
 * 
 *   装饰者模式的问题及解决:用装饰者实例化组件时,将增加代码的复杂度,一旦应用了装饰者模式,不只需要实例化组件,
 *   还要把组件包装进装饰者,而这样的装饰者有多少个是不确定的。这里可以应用工厂模式来实例化组件来简化操作。
 * @author csdc
 *使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。    
 */
public class Decorator extends Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;//多态，在编译期间不确定，运行期间确定
	}


	@Override
	protected List<News> getListOfNews() {
		
		return component.getListOfNews();
	}

}
