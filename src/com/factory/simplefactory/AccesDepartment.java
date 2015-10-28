package com.factory.simplefactory;

public class AccesDepartment  implements IDepartment{

	@Override
	public void insert(Department d) {
		// TODO Auto-generated method stub

		System.out.println("在Access中的department表中插入一条记录");
		
	}

	@Override
	public IDepartment getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中的department中查找记录");
		return null;
	}

}
