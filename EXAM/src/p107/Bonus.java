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
		
		System.out.print("실적을 입력하세요(단위:만원) : ");
		sale=input.nextInt();
		tax = (int)(sale * TAXRATE);
		
		if(sale>=TARGET) {
			result="실적 달성";
			difference = sale - TARGET;
			bonus = (int)(difference * BONUSRATE); 
			
		}
		else {
			result="실적 미달성";
			bonus=0;
		}
		
		System.out.println(result +"\n" + "보너스 : " + bonus);
		System.out.println("세금 : " + tax);
		
		
		
	}

}
