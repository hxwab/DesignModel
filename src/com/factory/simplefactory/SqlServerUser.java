package com.factory.simplefactory;
/**
 * 用于访问Sql 的User
 * @author win7
 *
 */
public class SqlServerUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在SqlServer 中给User 增加一条记录");
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SqlServer中根据ID 查找User记录");
		return null;
	}

}
