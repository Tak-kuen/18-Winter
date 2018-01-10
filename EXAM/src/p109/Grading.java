package p109;

import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요 ");
		score = input.nextInt();
		
		if(score>=90) {
			grade = "A학점";
		}
		else if(score>=80) {
			grade = "B학점";
		}
		else if(score>=70){
			grade = "C학점";
		}
		else {
			grade = "F학점";
		}
		
		System.out.println("당신은 " + grade + "입니다");
	}

}
