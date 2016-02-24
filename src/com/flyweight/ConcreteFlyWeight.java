package com.flyweight;

/**
 * 享元模式的实现类
 * @author csdc
 *
 */
public class ConcreteFlyWeight  extends FlyWeight{

	private String name;
	
	
	public ConcreteFlyWeight(String name) {
		this.name = name;
	}

	@Override
	protected void operation() {
		System.out.println(" concrete weight:  "+name);
	}

}
