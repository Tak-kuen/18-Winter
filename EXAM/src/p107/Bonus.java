package p107;

import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TARGET = 1000;
		final double BONUSRATE = 0.2;
		final double TAXRATE=0.1;
		int sale, difference, bonus,tax;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(����:����) : ");
		sale=input.nextInt();
		tax = (int)(sale * TAXRATE);
		
		if(sale>=TARGET) {
			result="���� �޼�";
			difference = sale - TARGET;
			bonus = (int)(difference * BONUSRATE); 
			
		}
		else {
			result="���� �̴޼�";
			bonus=0;
		}
		
		System.out.println(result +"\n" + "���ʽ� : " + bonus);
		System.out.println("���� : " + tax);
		
		
		
	}

}
