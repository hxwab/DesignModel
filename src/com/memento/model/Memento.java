package com.memento.model;
/**
 * 
 * 负责存储originor对象的内部状态，并可防止originor
 *  以外的其他对象访问备忘录Memento
 * 
 * @author win7
 *
 */


public class Memento {

	
	private String state;//数据状态

	public Memento(String state) {
		
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}
