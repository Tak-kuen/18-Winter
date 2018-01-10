package p92;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		double sum;
		
		System.out.print("첫번째 숫자를 입력하시오 : ");
		x = input.nextDouble();
		
		System.out.print("두번째 숫자를 입력하시오 : ");
		y = input.nextDouble();
		
		sum=x+y;
		
		System.out.println(sum);
	}

}
