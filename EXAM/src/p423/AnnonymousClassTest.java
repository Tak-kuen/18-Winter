package p423;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {
			public void turnOn() {
				System.out.println("turnOn()");
			}
			public void turnOff() {
				System.out.println("turnOff()");
			}
		};
		
		ac.turnOn();
		ac.turnOff();
	}
	
}
