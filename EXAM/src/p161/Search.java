package p161;

import java.util.*;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int whatNum;
		int count=0;
		int num [] = {10,50,80,30,90,60,40,20,50,90};
		
		System.out.print("ã�� ���ڸ� �Է��ϼ���(10~90) ");
		whatNum=input.nextInt();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==whatNum) {
				System.out.printf("�Է��� %d ���� %d��°�� �ֽ��ϴ�",whatNum,i+1);
				System.out.println();
				count++;
			}
		}
		if(count==0) {
			System.out.println("ã�� ���� �����ϴ�.");
		}
	}
}
