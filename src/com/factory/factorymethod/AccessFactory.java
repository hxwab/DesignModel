package com.factory.factorymethod;
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

}
