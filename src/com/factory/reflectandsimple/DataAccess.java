package com.factory.reflectandsimple;

public class DataAccess {

	private static final String DB = "SqlServer";
	
	public static IUser creatUser(){
		
		IUser user = null;
		switch (DB) {
		case "SqlServer":
			
			user= new SqlServerUser();
			break;

		case "Access":
			user = new AccessUser();
		default:
			break;
		}
		
		return user;
		
	}
	
	public static IDepartment creatDepartment(){
		
		IDepartment idept = null;
		switch (DB) {
		case "SqlServer":
			idept = new SqlServerDepartment();
			break;
			
		case "Access":
			idept =  new AccesDepartment();
           break;
		default:
			break;
		}
		
		return idept;
	}
	
	
}
