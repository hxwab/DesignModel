package com.command;

public class MakeChickenWingsCommand extends Command {

	public MakeChickenWingsCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.makeChickenWing();
	}

}
