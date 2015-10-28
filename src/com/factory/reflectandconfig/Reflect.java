package com.factory.reflectandconfig;

import java.io.IOException;
import java.util.Properties;

public class Reflect {

	private static final  String ASSEMBLENAME = "com.factory.reflectandconfig";
	private static  String  DB =null;
	public static final  String USER = "User";
	public static final  String DEPT = "Department";
	
	
	static{
		
		DB = readValue("DB");
		
	}
	
	
	/**
	 * 
	 * 
	 * @param dbName 数据库名称
	 * @param name   要声明的类型
	 * @return       返回创建类型
	 */
	public static Object creat( String name){
		
		String className = ASSEMBLENAME + "." +DB+ name;
		
		
		Object o= null;
		
		@SuppressWarnings("rawtypes")
		Class cls= null;
		try {
			cls =Class.forName(className);
			o = cls.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	  return o;
		
	}
	
	public static IUser creatUser() {
		// TODO Auto-generated method stub
		
		//创建不同的实例只须要改变DB就可以了
		String className = ASSEMBLENAME + "." + DB + USER;
		
		@SuppressWarnings("rawtypes")
		Class cls = null;
		Object o=null;
		try {
			//获得类
			cls = Class.forName(className);
			//创建实例
			o = cls.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  (IUser) o;

	}
	
	public static IDepartment creatDepartment() {
		// TODO Auto-generated method stub
		
		//创建不同的实例只须要改变DB就可以了
		String className = ASSEMBLENAME + "." + DB + DEPT;
		
		@SuppressWarnings("rawtypes")
		Class cls = null;
		Object o=null;
		try {
			//获得类
			cls = Class.forName(className);
			//创建实例
			o = cls.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  (IDepartment) o;

	}
	
	/**
	 * @param key
	 * @return
	 */
	public static String readValue(String key){
		
		String value = "";
		Properties prop  = new Properties();
		try {
			//获取配置文件流
			prop.load(ClassLoader.getSystemResourceAsStream("properties"));
		    //获取相应的键值
			value = prop.getProperty(key);
		    return value;
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
