package p415;

interface Drivable {
	void drive();
}

interface Flyable {
	void fly();
}

public class FlyingCar implements Drivable, Flyable{
	public void drive() {
		System.out.println("�����ϰ�����!");
	}
	
	public void fly() {
		System.out.println("�ϴ� ������!");
	}
	
	public static void main(String[] args) {
		FlyingCar obj = new FlyingCar();
		obj.drive();
		obj.fly();
	}
	
}
