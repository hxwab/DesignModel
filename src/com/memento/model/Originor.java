package com.memento.model; 

/**
 * 
 * ���𴴽�����¼�����Լ�¼����ǰʱ�̵�״̬��������ʹ�ñ���¼�ָ�״̬
 * @author win7
 *
 */
 
 
public class Originor {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//����״̬��memento
	public Memento creatMemento(){
		
		return new Memento(state);
	}
	
	//�ظ�״̬
	public void getMemento(Memento memento){
		
		state = memento.getState();
	}
	
	public void show (){
		
		System.out.println("state "+state);
	}
	
}
