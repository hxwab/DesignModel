package com.factory.reflectandconfig;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department d) {
		// TODO Auto-generated method stub
		System.out.println("��SqlServer �е�department���ݱ��в���һ����¼");
	}

	@Override
	public IDepartment getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SqlServer �в���department��¼");
		return null;
	}

}
