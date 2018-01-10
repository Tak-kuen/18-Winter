package p404;

public class HyundaiCar implements OperateCar{
	
	String BrandName = "HD";
	
	public void start() {
		System.out.println(BrandName + " : 출발");
	}
	
	public void stop() {
		System.out.println(BrandName + " : 정지");
	}
	
	public void setSpeed(int speed) {
		System.out.println(BrandName + " : " + speed + "Km 설정");
	}
	
	public void turn(int degree) {
		System.out.println(BrandName + " : " +degree + "도 회전");
	}
}
