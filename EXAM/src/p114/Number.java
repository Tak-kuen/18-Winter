package p114;

import java.util.*;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("숫자입력하세요 ");
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		
		switch(num)
		{
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("多");
			break;
		}
	}

}
