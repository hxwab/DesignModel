package com.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
	private static ReentrantLock lock =  new ReentrantLock();
	private static Singleton instance=null;
	private static Object ojb = new Object();
	
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	//每次调用都上锁
	public static Singleton getInstance(){
		lock.lock();
		try{
			if(instance==null){
				instance = new Singleton();
			}
		}finally{
			lock.unlock();
		}
		return instance;
	}
	
	//每次调用都上锁
	public static Singleton getInstance0(){
		synchronized (ojb) {
			if(instance==null){
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	
	//上锁耗时，先判断们对于instance 为null的上锁
	//这里可以保证只实例化一次 
            //即在第一次调用时实例化 
            //以后调用便不会再实例化 
            //为何双重判断？
            /*
            这里就涉及一个性能问题了，因为对于单例模式的话，new Singleton（）只需要执行一次就 OK 了，

而如果没有第一重 singleton == null 的话，每一次有线程进入 GetInstance（）时，均会执行锁定操作来实现线程同步，

这是非常耗费性能的，而如果我加上第一重 singleton == null 的话，

那么就只有在第一次，也就是 singleton ==null 成立时的情况下执行一次锁定以实现线程同步，

而以后的话，便只要直接返回 Singleton 实例就 OK 了而根本无需再进入 lock 语句块了，这样就可以解决由线程同步带来的性能问题了。
            */
	public static Singleton getInstance1(){
		
		if(instance==null){
			
			synchronized (ojb) {
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	

}


class Singleton2{
	
	private static Singleton2 instance =null;
	//静态块在该类加载的时候执行，且存储在单独开辟的空间
	static{
		instance = new Singleton2();
	}
	private Singleton2() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton2 getInstance(){
		
		return instance;
	}
}
