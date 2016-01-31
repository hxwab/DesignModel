package com.command;

public class MakeMuttonCommand extends Command {

	public MakeMuttonCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.makeMutton();
	}
	
}
