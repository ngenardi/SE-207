package edu.monmouth.se207.s1313642.StatePattern;

public class TVOffState implements RemoteState {

	TVSet tvSet;
	TVRemote remote;
	
	public TVOffState(TVSet tvSet, TVRemote remote) {
		this.tvSet = tvSet;
		this.remote = remote;
	}
	
	@Override
	public void volumeUp() {
		System.out.println("tv is off - can't raise the volume");
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("tv is off - can't lower the volume");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("tv is off - can't change the channel");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("tv is off - can't change the channel");
	}

	@Override
	public void tvOn() {
		// TODO Auto-generated method stub
		remote.setState(remote.getTvOnState());
	}

	@Override
	public void tvOff() {
		System.out.println("tv is already turned off");
	}

	@Override
	public void channelDigit(int num) {
		// TODO Auto-generated method stub
		System.out.println("tv is off - can't change the channel");
	}

	@Override
	public void channelSelect() {
		// TODO Auto-generated method stub
		System.out.println("tv is off - can't change the channel");
	}
	
	public String toString () {
		return "TV is Off";
	}

	

}
