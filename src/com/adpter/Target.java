package com.adpter;

/**
 * 适配器模式的用意是要改变源的接口，以便于目标接口相容
 * @author csdc
 *
 */
public interface Target {
	
	/**
     * 这是源类Adaptee也有的方法
     */
	public void method1();
	
	
	  /**
     * 这是源类Adapteee没有的方法
     */
	public void method2();

}