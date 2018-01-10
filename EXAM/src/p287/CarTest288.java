package p287;

public class CarTest288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("S600","white",80);
		Car c2 = new Car("E500","blue",20);
		int n = Car.getNumberOfCars(); // c1.getNumberOfCars가 아니라 클래스 이름으로 불러온다
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}

