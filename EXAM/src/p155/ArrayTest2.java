package p155;

import java.util.*;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		final int STUDENT = 5;
		int[] score = new int[STUDENT];
		/*
		int[] score = new int[5];	//����� �Ἥ �پ��� ��Ȳ�� �������
		*/
		int total=0;
		Scanner inputScore = new Scanner(System.in);

		for(int i=0 ; i<score.length ; i++) {	//score.length ��ſ� STUDENT �ᵵ ����
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = inputScore.nextInt();
			total+=score[i];
		}
		
		System.out.printf("��� ������ %d", total/STUDENT);
		
	}

}
