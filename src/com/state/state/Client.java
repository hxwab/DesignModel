package com.state.state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context  context = new Context(new CreateStateA());
		context.request();
		context.request();
		context.request();
	}

}
