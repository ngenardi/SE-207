package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class GameBox {

	boolean boxOn = false;
	private BoxOn onCommand;
	private BoxOff offCommand;
	
	public GameBox() {
		onCommand  = new BoxOn(this);
		offCommand = new BoxOff(this);
	}
	
	public BoxOn getOnCommand() {
		return onCommand;
	}
	
	public BoxOff getOffCommand() {
		return offCommand;
	}
	
	public void turnOn() {
		System.out.println("GameBox is On");
		boxOn = true;
	}

	public void turnOff() {
		System.out.println("GameBox is Off");
		boxOn = false;
	}

	public boolean getBoxOn() {
		return boxOn;
	}
}
