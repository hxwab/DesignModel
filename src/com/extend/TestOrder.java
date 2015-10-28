package com.extend;
/**
 * //各个对象的初始化顺序如下： 
 *
 *           //①子类静态成员变量  
 *           //②子类静态构造函数  
 *           //③子类实例成员变量  
 *           //④父类静态成员变量  
 *           //⑤父类静态构造函数  
 *          //⑥父类实例成员变量  
 *           //⑦父类构造函数  
 *           //⑧子类构造函数
 */
public class TestOrder {

	public static void main(String[] args) {
		
		//BaseSub bs = new BaseSub();
		System.out.println("========");
		Base base = new BaseSub();
		
	}
}
