package edu.monmouth.se207.s1313642.StatePattern;

public class TVOnState implements RemoteState {

	TVSet tvSet;
	TVRemote remote;

	public TVOnState(TVSet tvSet, TVRemote remote) {
		this.tvSet = tvSet;
		this.remote = remote;
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		tvSet.setVolumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		tvSet.setVolumeDown();
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		tvSet.setNextChannel();
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		tvSet.setPrevChannel();
	}

	@Override
	public void tvOn() {
		// TODO Auto-generated method stub
		System.out.println("tv is already turned on");
	}

	@Override
	public void tvOff() {
		// TODO Auto-generated method stub
		remote.setState(remote.getTvOffState());
	}

	@Override
	public void channelDigit(int num) {
		// TODO Auto-generated method stub
		remote.setState(remote.getChannelCodeState());
		remote.channelDigit(num);
	}

	@Override
	public void channelSelect() {
		// TODO Auto-generated method stub
		System.out.println("unable to change channel - no channel numer was input");
	}

	public String toString() {
		return "TV is On";
	}
}
