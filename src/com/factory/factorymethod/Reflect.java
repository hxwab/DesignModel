package com.factory.factorymethod;

public class Reflect {

	private static final  String ASSEMBLENAME = "com.factory.factorymethod";
	private static final String  DB = "SqlServer";
	private static final  String USER = "User";
	
	public static IUser creatUser() {
		// TODO Auto-generated method stub
		
		//������ͬ��ʵ��ֻ��Ҫ�ı�DB�Ϳ�����
		String className = ASSEMBLENAME + "." + DB + USER;
		
		@SuppressWarnings("rawtypes")
		Class cls = null;
		Object o=null;
		try {
			//�����
			cls = Class.forName(className);
			//����ʵ��
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
}
