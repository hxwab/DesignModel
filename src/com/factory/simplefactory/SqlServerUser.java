package com.factory.simplefactory;
/**
 * ���ڷ���Sql ��User
 * @author win7
 *
 */
public class SqlServerUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��SqlServer �и�User ����һ����¼");
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SqlServer�и���ID ����User��¼");
		return null;
	}

}
