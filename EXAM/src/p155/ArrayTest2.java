package p155;

import java.util.*;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		final int STUDENT = 5;
		int[] score = new int[STUDENT];
		/*
		int[] score = new int[5];	//상수를 써서 다양한 상황에 대비하자
		*/
		int total=0;
		Scanner inputScore = new Scanner(System.in);

		for(int i=0 ; i<score.length ; i++) {	//score.length 대신에 STUDENT 써도 무방
			System.out.print("성적을 입력하세요 : ");
			score[i] = inputScore.nextInt();
			total+=score[i];
		}
		
		System.out.printf("평균 성적은 %d", total/STUDENT);
		
	}

}
