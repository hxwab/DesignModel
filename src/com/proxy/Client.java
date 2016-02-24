package com.proxy;

public class Client {
	
	public static void main(String[] args) {
		Subject subject = new Proxy(1);//直接使用代理类，客户端不知道代理类使用了另外的realSubject类
		subject.doAction();
	}

}
