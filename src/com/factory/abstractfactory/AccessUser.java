package com.factory.abstractfactory;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
	
		System.out.println("在Access中插入插入一条记录");
	}

	@Override
	public User getUser(int id) {	
		System.out.println("在Access 中根据ID查找User记录");
		return null;
	}

}
