package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		// TODO - issue the light off command to a light object
		if (light.getLightOn()) {
			light.turnOff();
		}
	}
}
