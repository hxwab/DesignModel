package com.factory.reflectandsimple;

public class Reflect {

	private static final  String ASSEMBLENAME = "com.factory.reflectandsimple";
	public static final  String  DB_SQL = "SqlServer";
	public static final  String DB_ACCESS = "Access";
	public static final  String DB_ORACLE = "Oracle";
	public static final  String USER = "User";
	public static final  String DEPT = "Department";
	
	
	
	/**
	 * 
	 * 
	 * @param dbName 数据库名称
	 * @param name   要声明的类型
	 * @return       返回创建类型
	 */
	public static Object creat(String dbName ,String name){
		String className = ASSEMBLENAME + "." +dbName+ name;
		
		
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
		String className = ASSEMBLENAME + "." + DB_SQL + USER;
		
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
		String className = ASSEMBLENAME + "." + DB_SQL + DEPT;
		
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
}
