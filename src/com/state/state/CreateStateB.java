package com.state.state;

public class CreateStateB implements State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new CreateStateA());
		System.out.println("B-->A");
	}

}
