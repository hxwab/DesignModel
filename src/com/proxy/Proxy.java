package com.proxy;
/**
 * 代理模式：在不改变接口的前提下，控制对象的访问
 * @author csdc
 *在正真调用业务之前，做一些额外的业务操作
 *
 *屏蔽了业务的具体实现细节
 */
public class Proxy implements Subject {

	private Subject subject;
	
	private int pression;
	
	private static final int ALLOW = 1;
	
	public Proxy(int pression) {
		subject = new RealSubject();//编译时该类已确定
		this.pression =pression;
	}
	
	public Proxy(Subject subject){
		this.subject=subject;
	}
	
	public Proxy(Subject subject,int pression){
		this(subject);
		this.pression=pression;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.proxy.Subject#doAction()
	 * 代理模式：在不改变接口的前提下，控制对象的访问
	 */
	 
	
	@Override
	public void doAction() {
		
		//在调用业务之前，做一些额外的业务处理
		if(pression ==ALLOW){
			subject.doAction();
		}else{
			System.out.println("无权限");
		}

	}

}
