package com.factory.abstractfactory;
/**
 * 访问User表对象的抽象工厂接口
 * 
 * @author win7
 *
 */
public interface IFactory {
 
	IUser creatUser();
	IDepartment creatDepartment();
}
