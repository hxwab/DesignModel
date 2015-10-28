package com.factory.reflectandsimple;
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
 * @version 4.0
 * @author win7
 * 
 * @category 添加了数据库Oracle的相关子类，添加了反射机制类reflect。根据输入的不同参数来创建
 *  		 不同的对象。
 *        
 *@problem  修改就需要编译，为了减少编译次数，可以添加配置文件
 *     
 *		      
 *
 *@solution  也可以用配置文件来设置参数，见version 5.0
 *
 */
public class TestCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		Department dept = new Department();
		
		
		IUser iu ;
		IDepartment idept;
		
		
		iu = (IUser) Reflect.creat(Reflect.DB_ACCESS,Reflect.USER);
		idept = (IDepartment) Reflect.creat(Reflect.DB_SQL, Reflect.DEPT);
		
		//iu = DataAccess.creatUser();// 直接得到数据库访问的实例
		                            //无任何依赖操作，在客户端隐藏。达到解耦目的
		iu.insert(user);
		iu.getUser(1);
		
		//idept = DataAccess.creatDepartment();
		idept.insert(dept);
		idept.getDepartment(1);
		
		
		IUser iuser = Reflect.creatUser();
		System.out.println("=========");
		iuser.insert(user);
		
	}

}

