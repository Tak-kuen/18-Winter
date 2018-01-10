package p133;

import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, temp1=0, temp2=0;
		int sum=0;
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 ");
		num1 = inputNumber.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		num2 = inputNumber.nextInt();
		
		if(num1>num2) {
			temp1=num1;
			temp2=num2;
			num1=num2;
			num2=temp1;
			
			for(;num1<=num2;num1++) {
				sum=sum+num1;
			}
			System.out.printf("%d부터 %d까지의 합은 %d", temp2, temp1, sum);
		}
		else {
			temp1=num1;
			temp2=num2;

			for(;num1<=num2;num1++) {
				sum=sum+num1;
			}
			System.out.printf("%d부터 %d까지의 합은 %d", temp1, temp2, sum);
		}
	}
}
