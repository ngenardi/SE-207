package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		// TODO - issue a light on command to a light object
		if(!light.getLightOn()) {
			light.turnOn();
		}
	}
}
