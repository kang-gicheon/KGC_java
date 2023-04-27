package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
	
		Remotecontrol rc;
		
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();

	}

}
