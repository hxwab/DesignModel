package com.memento.model; 

/**
 * 
 * 负责创建备忘录，用以记录它当前时刻的状态，并可以使用备忘录恢复状态
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
	
	//保存状态到memento
	public Memento creatMemento(){
		
		return new Memento(state);
	}
	
	//回复状态
	public void getMemento(Memento memento){
		
		state = memento.getState();
	}
	
	public void show (){
		
		System.out.println("state "+state);
	}
	
}
