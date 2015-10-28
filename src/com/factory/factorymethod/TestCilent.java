package com.factory.factorymethod;
/**
 * 问题描述：目前客户需求为访问SqlServer数据库。但考虑到客户有可能更换数据库
 *       的情况，为了防止更改大量的代码，我们采用多态定义一个接口，让子
 *       类决定实例化哪一个类。
 * 
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个
 *        类。工厂方法是一个类的实例化延迟到其子类
 *        
 * 带来的问题：客户端需要决定实例化哪一个工厂来实现数据库的调用
 *        选择判断的问题还是存在的。也就是说，工厂方法把简单工厂内部
 *        逻辑判断移到了客户端代码来进行。你想要加功能，本来是该工厂
 *        类的，而现在是修改客户端
 *        
 * @version 1.0
 * @author win7
 *
 */
public class TestCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		IFactory factory ;
		IUser iu ;
		
		user.getId();
		
		
		
		factory = new SqlServerFactory();
		iu = factory.creatUser();
		iu.insert(user);
		iu.getUser(1);
		
		factory = new AccessFactory();
		iu = factory.creatUser();
		iu.insert(user);
		iu.getUser(1);
		
		
		IUser iuser = Reflect.creatUser();
		System.out.println("=========");
		iuser.insert(user);
		
	}

}

/**
 * *        虽然实例化子类的灵活性增强了（具体表现在可以很容易的在数据库之间切换），
 *        但是如果要增加一个数据库表的话，就要在所有的类中增加对表的操作。
 *        这不仅工作量大，而且也违背了开放--封闭原则
 *        
 *        工厂方法模式只适用于有一个操作对象（此处的User），若添加一个Department
 *        则对代码的改动很大。此时应该用抽象工厂模式
 * 
 */
