package p404;

public class AutoCarTest {

	public static void main(String[] args) {
		OperateCar oc = new HyundaiCar();
		OperateCar oc2 = new BMWCar();
		
		oc.start();
		oc.turn(10);
		
		oc2.start();
		oc2.setSpeed(180);
		oc2.stop();

	}

}
