package com.state.state;

public class Context {
	
	private  State state;

	
	public Context(State state) {
		this.setState(state);
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	
	
	public void request(){
		
		state.handle(this);
	}
	
	
	
	
}
