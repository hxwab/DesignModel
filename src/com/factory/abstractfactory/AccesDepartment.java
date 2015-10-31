package com.factory.abstractfactory;

public class AccesDepartment  implements IDepartment{

	@Override
	public void insert(Department d) {

		System.out.println("在Access中的department表中插入一条记录");
		
	}

	@Override
	public IDepartment getDepartment(int id) {
		System.out.println("在Access中的department中查找记录");
		return null;
	}

}
