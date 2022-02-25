package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class CommandTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Light Test:");
		Light light = new Light();
		RemoteControl lightRemote = new RemoteControl(light.getOnCommand(),light.getOffCommand());
		
		lightRemote.pressUp();
		lightRemote.pressUp();
		lightRemote.pressDown();
		lightRemote.pressDown();
		
		System.out.println("\nTV Test:");
		TV tv = new TV();
		RemoteControl tvRemote = new RemoteControl(tv.getOnCommand(),tv.getOffCommand());
		
		tvRemote.pressUp();
		tvRemote.pressUp();
		tvRemote.pressDown();
		tvRemote.pressDown();
		
		System.out.println("\nGameBox Test:");
		GameBox gameBox = new GameBox();
		RemoteControl gameBoxRemote = new RemoteControl(gameBox.getOnCommand(),gameBox.getOffCommand());
		
		gameBoxRemote.pressUp();
		gameBoxRemote.pressUp();
		gameBoxRemote.pressDown();
		gameBoxRemote.pressDown();
		
	}

}
