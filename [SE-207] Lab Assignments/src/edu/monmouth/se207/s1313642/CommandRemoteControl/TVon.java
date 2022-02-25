package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class TVon implements Command {
	
	TV tv;

	public TVon(TV tv) {
		this.tv=tv;
	}

	@Override
	public void execute() {
		// TODO - issue a light on command to a light object
		if(!tv.getTVOn()) {
			tv.turnOn();
		}
	}
}
