package p130;

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big, small, temp=0;
		int r;
		int gcd=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		big = input.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		small = input.nextInt();
		
		if(big-small<0) {
			temp=big;
			big=small;
			small=temp;
		}
		while(small!=0) {
			r=big%small;
			big=small;
			small=r;
		}
		gcd=big;
		System.out.println("�ִ������� " + gcd + "�Դϴ�.");
	}
}
