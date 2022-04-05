package edu.monmouth.se207.s1313642.StatePattern;

public class TVRemote {
	
	private TVSet myTV;
	private RemoteState state;
	
	private RemoteState tvOff;
	
	// declare other RemoteState variables below

	private RemoteState tvOn;
	private RemoteState tvChannelCode;
	
	public TVRemote() {
		
		// get the Singleton TVSet object
		
		 myTV = TVSet.getInstance();
		 
		 //  instantiate RemoteStates
		 
		 tvOff = new TVOffState(myTV,this);
		 
		 // instantiate Other RemoteState variables below

		 tvOn = new TVOnState(myTV,this);
		 tvChannelCode = new TVChannelCodeState(myTV,this);
		 
		// initial state is TV off
		  
		 state = tvOff; 
		 
	}
	
	// set the TVSets state
	
	void setState(RemoteState state) {
		this.state = state;
	}
	
	// getter for TV offState
	
	public RemoteState getTvOffState() { 
		return this.tvOff; 
	}
	
	// implement getters for other Remote states
	
	// getter for tvOn state
	public RemoteState getTvOnState() {
		return this.tvOn;
	}
	
	// getter for channelCode state
	public RemoteState getChannelCodeState() {
		return this.tvChannelCode;
	}
	
	// TV Controls
	public void tvOff() {
		state.tvOff();
	}
	
	// implement other Action Methods
	
	public void tvOn() {
		state.tvOn();
	}
	
	
	// Volume controls
	public void volumeUp() {
		state.volumeUp();
	}
	
	public void volumeDown() {
		state.volumeDown();
	}
	
	// Channel scroll
	public void channelUp() {
		state.channelUp();
	}
	
	public void channelDown() {
		state.channelDown();
	}

	// Channel Digits
	public void channelDigit(int num) {
		state.channelDigit(num);
	}
	
	public void channelSelect() {
		state.channelSelect();
	}
	
	
	// Print TV Set info
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMy TV Set Info.\n");
		result.append(state.toString());
		result.append("\n");
		result.append("TV Channel is " + myTV.getChannel() + "\n");
		result.append("TV Volume is " + myTV.getVolume() + "\n");
		
		return result.toString();
	}
	
}
