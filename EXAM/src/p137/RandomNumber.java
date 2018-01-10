package p137;

import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		int rndNumber;
		int rndCount;
		long sum=0;
		
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("반복할 횟수를 입력하세요 ");
		rndCount = inputNumber.nextInt();
		
		for(int i=0; i<rndCount;i++) {
			rndNumber= (int)(Math.random()*100);	// how to make random number
			sum +=rndNumber;
		}
		System.out.printf("난수 %d개의 합은 %d입니다", rndCount, sum);
		//System.out.println("난수 " + rndCount + "개의 합은 " + sum + "입니다");
	}

}
