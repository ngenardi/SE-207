package edu.monmouth.se207.s1313642.CommandRemoteControl;

public class RemoteControl {

	private Command UpCommand, DownCommand;

	public RemoteControl( Command Up, Command Down) {
		UpCommand = Up; // concrete Command registers itself with the invoker 
		DownCommand = Down;
	}

	public void pressUp ( ) { // invoker calls back concrete Command, which executes the Command on the receiver 
		UpCommand.execute ( ) ;                           
	}

	public void pressDown( ) {
		DownCommand.execute ( );
	}

}
