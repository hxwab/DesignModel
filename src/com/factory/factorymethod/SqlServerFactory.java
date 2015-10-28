package com.factory.factorymethod;

public class SqlServerFactory implements IFactory{

	@Override
	public IUser creatUser() {
		// TODO Auto-generated method stub
		return new SqlServerUser();
	}

}
