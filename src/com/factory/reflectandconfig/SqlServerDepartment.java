package com.factory.reflectandconfig;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department d) {
		// TODO Auto-generated method stub
		System.out.println("在SqlServer 中的department数据表中插入一条记录");
	}

	@Override
	public IDepartment getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SqlServer 中查找department记录");
		return null;
	}

}
