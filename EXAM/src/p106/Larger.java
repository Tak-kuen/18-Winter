package p106;

import java.util.*;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second,third, larger ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		first = input.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		second = input.nextInt();
	
		System.out.print("����° ���� �Է��ϼ��� : ");
		third= input.nextInt();
		
		if(first>= (second + third)) {
			larger= first;
		}
		else if (second>third) {
			larger= second;
		}
		else {
			larger=third;
		}
		/* if(first>second) {
		 * larger=first;}
		 * else{
		 * larger=second;}
		 * 
		 * if(larger<third){
		 * larger=third;}
		 */
		System.out.println("ū ���� " + larger);
	}

}
