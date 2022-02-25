package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class BoxOn implements Command {

	GameBox box;

	public BoxOn(GameBox box) {
		this.box=box;
	}

	@Override
	public void execute() {
		// TODO - issue a light on command to a light object
		if(!box.getBoxOn()) {
			box.turnOn();
		}
	}
}
