package p415;

interface Drivable {
	void drive();
}

interface Flyable {
	void fly();
}

public class FlyingCar implements Drivable, Flyable{
	public void drive() {
		System.out.println("운전하고있음!");
	}
	
	public void fly() {
		System.out.println("하늘 나는중!");
	}
	
	public static void main(String[] args) {
		FlyingCar obj = new FlyingCar();
		obj.drive();
		obj.fly();
	}
	
}
