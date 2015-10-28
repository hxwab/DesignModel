package com.state.state;

public class CreateStateA implements State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new CreateStateB());
		System.out.println("A-->B");
	}

}
