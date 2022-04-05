package edu.monmouth.se207.s1313642.StatePattern;

public class TVSet {

	private int volume;
	private int channel;
	
	private static TVSet tvInstance = new TVSet();  // Singleton object
	
	// constructor

	private TVSet() {
		volume = 5;
		channel = 1;
	}
		
	// Get singleton instance
	
	public static TVSet getInstance () { return tvInstance; }  
	
	// Volume setters and getter
	
	public void setVolumeUp () {
		if (volume < 10) {
			volume++;
		}
	}
	
	public void setVolumeDown () {
		if (volume > 0) {
			volume--;
		}
	}
	
	public int getVolume() { return volume; }
	
	
	// Channel setters and getter
	
	public void setChannel (int newChannel) {
		channel = newChannel;
	}
	
	public void setNextChannel () {
		if (channel < 100) {
			channel++;
			setChannel(channel);
		}
	}
	
	public int getChannel() {return channel; }
	
	public void setPrevChannel () {
		if (channel > 0) {
			channel--;
			setChannel(channel);
		}
	}
	
	
	
}
