package com.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.NEW;
/**
 * 享元模式的工厂类，实现对象的共享
 * @author csdc
 *
 */
public class FlyWeightFactory {
	
	private Map<Object, FlyWeight> flyWeights = new HashMap<Object, FlyWeight>();
	private FlyWeight flyWeight;
	private static FlyWeightFactory factory ;
	private static Object lock = new Object();
	
	
	private FlyWeightFactory(){
		
	}
	
	public static FlyWeightFactory getInstance(){ //单例模式
		if(factory==null){
			synchronized (lock) {
				if(factory==null){
					factory = new FlyWeightFactory();
				}
			}
		}
		
		return factory;
	}
	
	public FlyWeight    getFlyWeight(Object obj) {
		flyWeight = flyWeights.get(obj); //先在内存中查找看有无该对象，有直接返回，无新建并加入内存中（Map），保证共享对象
		if(flyWeight==null){
			flyWeight = new ConcreteFlyWeight((String) obj);
			flyWeights.put(obj, flyWeight);
		}
		return flyWeight;
	}
	
	public int getFlyWeightSize(){
		return flyWeights.size();
	}
	
	
}
