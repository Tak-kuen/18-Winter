package p98;

import java.util.*;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width;
		double height;
		double length;
		double area;
		
		System.out.print("���δ� ���Դϱ� ");
		width = input.nextDouble();
		System.out.print("���δ� ���Դϱ� ");
		height = input.nextDouble();
		
		length = (width+height)*2;
		
		area = width*height;
		
		System.out.println("�ѷ��� ���̴� : " + length);
		System.out.println("�簢���� ������ : " + area);

	}

}
