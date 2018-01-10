package p141;

import java.util.*;

public class Averager {

	public static void main(String[] args) {
		int total =0;
		int count =0;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력하세요 ");
			int grade = input.nextInt();
			
			if(grade<0)
				break;
			
			total+=grade;
			count++;
		}
		
		System.out.println("평균은 " + total/count);
		System.out.printf("총점은 %d, 과목수는 %d",total,count);
	}
}
