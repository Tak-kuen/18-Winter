package p134;

import java.util.*;

public class ForFactoiral {

	public static void main(String[] args) {
		long facNum=1;	//consider calculation data type
		int num;
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("Press number want to calculate ");
		num=inputNumber.nextInt();
		
		
		for( long i=1; i<=num ; i++) {
			facNum=facNum*i;
		}
		/*
		 * for(long i=num;i>0;i--) {
		 
			facNum=facNum*i;
		}
		*/
		System.out.printf("%d! = %d",num,facNum);
	}

}
