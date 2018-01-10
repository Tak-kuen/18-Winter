package p127;

import java.util.*;

public class CorrectInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("올바른 월을 입력하시오 [1-12] : " );
			month = input.nextInt();
			}while((month<=0)||(month>=13));
		
		System.out.println("사용자가 입력한 월은 " + month);
	}

}
