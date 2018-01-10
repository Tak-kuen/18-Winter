package p400;

public class Television implements RemoteControl {
	boolean onOff=false;
	public void turnOn() {
		onOff=true;
		System.out.println("ÄÒ´Ù");
	}
	
	public void turnOff() {
		onOff=false;
		System.out.println("²ö´Ù");
	}
}
