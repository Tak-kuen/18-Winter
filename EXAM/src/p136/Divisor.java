package p136;

import java.util.*;

public class Divisor {

	public static void main(String[] args) {
		int num;
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("약수를 구할 숫자를 입력하세요 ");
		num = inputNumber.nextInt();
		System.out.println(num + "의 약수는 다음과 같습니다");
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
	}
}
