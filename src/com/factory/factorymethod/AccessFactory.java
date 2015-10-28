package com.factory.factorymethod;
/**
 * 
 * ÊµÀý»¯AccessUser
 * @author win7
 *
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser creatUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

}
