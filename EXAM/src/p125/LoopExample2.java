package p125;

import java.util.*;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int dan=1;
		int result=0;
		
		System.out.print("�����ܿ��� �˰���� ���� �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		while(num<10) {
			while(dan<10) {
				result=dan*num;
				System.out.println(num + " X " + dan + " = " + result);
				dan++;
			}
		dan=1;
		num++;
		}

	}

}
