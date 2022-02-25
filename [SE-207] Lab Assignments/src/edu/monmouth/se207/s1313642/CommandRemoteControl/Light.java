package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class Light {

	private boolean lightOn = false;
	private LightOnCommand onCommand;
	private LightOffCommand offCommand;
	
	public Light() {
		onCommand  = new LightOnCommand(this);
		offCommand = new LightOffCommand(this);
	}
	
	public LightOnCommand getOnCommand() {
		return onCommand;
	}
	
	public LightOffCommand getOffCommand() {
		return offCommand;
	}
	
	public void turnOn() {
		System.out.println("Light is On");
		lightOn = true;
	}
	
	public void turnOff() {
		System.out.println("Light is Off");
		lightOn = false;
	}
	
	public boolean getLightOn() {
		return lightOn;
	}
}
