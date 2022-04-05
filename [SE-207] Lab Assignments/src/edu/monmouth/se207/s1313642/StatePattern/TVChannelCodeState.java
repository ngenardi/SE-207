package edu.monmouth.se207.s1313642.StatePattern;

public class TVChannelCodeState implements RemoteState {

	TVSet tvSet;
	TVRemote remote;
	StringBuilder channelNum = new StringBuilder();
	
	public TVChannelCodeState(TVSet tvSet, TVRemote remote) {
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
		System.out.println("unable to change channel - input and select a channel number before scrolling through the channels");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("unable to change channel - input and select a channel number before scrolling through the channels");
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
		channelNum.append(num);
	}

	@Override
	public void channelSelect() {
		// TODO Auto-generated method stub
		tvSet.setChannel(Integer.parseInt(channelNum.toString()));
		remote.setState(remote.getTvOnState());
		channelNum.delete(0, channelNum.length());
	}
	
	public String toString() {
		return "Inputting Channel Number";
	}

}
