package p144;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		int rndNum;
		int inputNum;
		int count=1;
		
		rndNum=(int)(Math.random()*100);
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� ");
			Scanner input = new Scanner(System.in);
			inputNum= input.nextInt();
			if(inputNum>rndNum){
				System.out.println("�Է��Ѽ��ڰ� ��Ů�ϴ�.");
				count++;
				continue;
			}
			if(inputNum<rndNum) {
				System.out.println("�Է��Ѽ��ڰ� �۽��ϴ�.");
				count++;
				continue;
			}
			if(inputNum==rndNum) {
				System.out.println("���߼̽��ϴ�!");
				break;
			}
		}
		System.out.printf("%d������ ���߼̽��ϴ�.",count);
		System.out.println("���α׷��� �����մϴ�.");
	}
}
