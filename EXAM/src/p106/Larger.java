package p106;

import java.util.*;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second,third, larger ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		first = input.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		second = input.nextInt();
	
		System.out.print("세번째 수를 입력하세요 : ");
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
		System.out.println("큰 수는 " + larger);
	}

}
