package com.factory.abstractfactory;

public class SqlServerFactory implements IFactory{

	@Override
	public IUser creatUser() {
		// TODO Auto-generated method stub
		return new SqlServerUser();
	}

	@Override
	public IDepartment creatDepartment() {
		// TODO Auto-generated method stub
		return new SqlServerDepartment();
	}

	
	

}
