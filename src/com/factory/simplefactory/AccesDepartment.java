package com.factory.simplefactory;

public class AccesDepartment  implements IDepartment{

	@Override
	public void insert(Department d) {
		// TODO Auto-generated method stub

		System.out.println("��Access�е�department���в���һ����¼");
		
	}

	@Override
	public IDepartment getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access�е�department�в��Ҽ�¼");
		return null;
	}

}
