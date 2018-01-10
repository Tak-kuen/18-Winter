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
		
		System.out.print("가로는 얼마입니까 ");
		width = input.nextDouble();
		System.out.print("세로는 얼마입니까 ");
		height = input.nextDouble();
		
		length = (width+height)*2;
		
		area = width*height;
		
		System.out.println("둘레의 길이는 : " + length);
		System.out.println("사각형의 면적은 : " + area);

	}

}
