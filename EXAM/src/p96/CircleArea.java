package p96;

import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius;
		final double PI = 3.141592;
		double area;
		
		System.out.print("�������� �Է��ϼ��� : ");
		radius = input.nextDouble();
		
		area = PI * radius * radius;
		System.out.println(area + "�Դϴ�");

	}

}
