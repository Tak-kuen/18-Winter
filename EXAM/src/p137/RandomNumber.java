package p137;

import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		int rndNumber;
		int rndCount;
		long sum=0;
		
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ���� �Է��ϼ��� ");
		rndCount = inputNumber.nextInt();
		
		for(int i=0; i<rndCount;i++) {
			rndNumber= (int)(Math.random()*100);	// how to make random number
			sum +=rndNumber;
		}
		System.out.printf("���� %d���� ���� %d�Դϴ�", rndCount, sum);
		//System.out.println("���� " + rndCount + "���� ���� " + sum + "�Դϴ�");
	}

}
