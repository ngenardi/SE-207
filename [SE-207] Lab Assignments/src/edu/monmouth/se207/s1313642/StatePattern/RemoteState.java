package edu.monmouth.se207.s1313642.StatePattern;

public interface RemoteState {

	public void volumeUp();
	public void volumeDown();
	public void channelUp();
	public void channelDown();
	
	public void tvOn();
	public void tvOff();
	
	public void channelDigit(int num);  // digit key pressed
	
	public void channelSelect();  // enter key pressed
	
	public String toString();
	
}
