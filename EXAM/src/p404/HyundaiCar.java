package p404;

public class HyundaiCar implements OperateCar{
	
	String BrandName = "HD";
	
	public void start() {
		System.out.println(BrandName + " : ���");
	}
	
	public void stop() {
		System.out.println(BrandName + " : ����");
	}
	
	public void setSpeed(int speed) {
		System.out.println(BrandName + " : " + speed + "Km ����");
	}
	
	public void turn(int degree) {
		System.out.println(BrandName + " : " +degree + "�� ȸ��");
	}
}
