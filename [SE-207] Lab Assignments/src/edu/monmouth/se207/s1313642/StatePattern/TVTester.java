package edu.monmouth.se207.s1313642.StatePattern;

public class TVTester {

	public static void main(String[] args) {		
		TVRemote myTVRemote = new TVRemote();
		
		
		System.out.println("TV Off State Test: ");
		System.out.println(myTVRemote.toString());
		
		myTVRemote.tvOff();
		
		// Should all be invalid
		myTVRemote.channelUp();
		myTVRemote.channelDown();
		myTVRemote.volumeUp();
		myTVRemote.volumeDown();
		myTVRemote.channelDigit(123);
		myTVRemote.channelSelect();
		
		// Testing on state
		System.out.println("\nTV On State Test: ");
		myTVRemote.tvOn();
		myTVRemote.channelUp();
		myTVRemote.channelUp();
		myTVRemote.channelUp();
		myTVRemote.channelDown();
		myTVRemote.volumeDown();
		myTVRemote.volumeDown();
		myTVRemote.volumeDown();
		myTVRemote.volumeUp();
		myTVRemote.tvOn();
		myTVRemote.tvOff();
		myTVRemote.tvOn();
		// volume = 3, channel = 3, TV on
		System.out.println("\n" + myTVRemote.toString());
		
		
		// Testing Channel Code State
		System.out.println("\nTV Channel Code State Test: ");
		myTVRemote.channelDigit(1);
		myTVRemote.volumeUp();
		myTVRemote.volumeUp();
		myTVRemote.volumeDown();
		myTVRemote.tvOn();
		myTVRemote.channelDown();
		myTVRemote.channelUp();
		myTVRemote.tvOff();
		myTVRemote.tvOn();
		myTVRemote.channelDigit(3);
		myTVRemote.channelSelect();
		// volume = 4, channel = 13
		System.out.println("\n" + myTVRemote.toString());
	}

}
