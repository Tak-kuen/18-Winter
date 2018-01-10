package p65b;

public class AreaTest {
	public static void main(String[] args) {
		double radius, area;		//실수형이니까 double을 사용
		radius = 0.5e+2;		//소수점은 기본적으로 double 형으로 되어있으므로 float형으로 바꾸어줘야함
		area = 3.141592f * radius * radius;
		System.out.println("원의 면적은 " + area);
	}
}
