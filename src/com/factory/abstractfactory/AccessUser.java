package com.factory.abstractfactory;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��Access�в������һ����¼");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access �и���ID����User��¼");
		return null;
	}

}
