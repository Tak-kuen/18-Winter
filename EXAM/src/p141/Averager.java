package p141;

import java.util.*;

public class Averager {

	public static void main(String[] args) {
		int total =0;
		int count =0;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է��ϼ��� ");
			int grade = input.nextInt();
			
			if(grade<0)
				break;
			
			total+=grade;
			count++;
		}
		
		System.out.println("����� " + total/count);
		System.out.printf("������ %d, ������� %d",total,count);
	}
}
