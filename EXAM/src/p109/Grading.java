package p109;

import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� ");
		score = input.nextInt();
		
		if(score>=90) {
			grade = "A����";
		}
		else if(score>=80) {
			grade = "B����";
		}
		else if(score>=70){
			grade = "C����";
		}
		else {
			grade = "F����";
		}
		
		System.out.println("����� " + grade + "�Դϴ�");
	}

}
