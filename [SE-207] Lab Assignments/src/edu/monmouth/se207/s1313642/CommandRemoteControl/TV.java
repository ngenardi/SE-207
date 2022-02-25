package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class TV {
	
	boolean tvOn = false;
	private TVon onCommand;
	private TVoff offCommand;
	
	public TV() {
		onCommand  = new TVon(this);
		offCommand = new TVoff(this);
	}
	
	public TVon getOnCommand() {
		return onCommand;
	}
	
	public TVoff getOffCommand() {
		return offCommand;
	}
	
	public void turnOn() {
		System.out.println("TV is On");
		tvOn = true;
	}
	
	public void turnOff() {
		System.out.println("TV is Off");
		tvOn = false;
	}
	
	public boolean getTVOn() {
		return tvOn;
	}
}
