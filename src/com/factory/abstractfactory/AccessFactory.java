package com.factory.abstractfactory;
/**
 * 
 * ʵ����AccessUser
 * @author win7
 *
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser creatUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	@Override
	public IDepartment creatDepartment() {
		// TODO Auto-generated method stub
		return new AccesDepartment();
	}

}
