package p127;

import java.util.*;

public class CorrectInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12] : " );
			month = input.nextInt();
			}while((month<=0)||(month>=13));
		
		System.out.println("����ڰ� �Է��� ���� " + month);
	}

}
