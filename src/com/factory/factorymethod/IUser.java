package com.factory.factorymethod;
/**
 * 
 * 解除跟具体数据库访问的耦合
 * @author win7
 *
 */

public interface IUser {

	void insert(User user);
	User getUser(int id);
}
