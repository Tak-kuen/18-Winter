package p136;

import java.util.*;

public class Divisor {

	public static void main(String[] args) {
		int num;
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("����� ���� ���ڸ� �Է��ϼ��� ");
		num = inputNumber.nextInt();
		System.out.println(num + "�� ����� ������ �����ϴ�");
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
	}
}
