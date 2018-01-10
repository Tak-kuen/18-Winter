package p144;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		int rndNum;
		int inputNum;
		int count=1;
		
		rndNum=(int)(Math.random()*100);
		
		while(true) {
			System.out.print("숫자를 입력하세요 ");
			Scanner input = new Scanner(System.in);
			inputNum= input.nextInt();
			if(inputNum>rndNum){
				System.out.println("입력한숫자가 더큽니다.");
				count++;
				continue;
			}
			if(inputNum<rndNum) {
				System.out.println("입력한숫자가 작습니다.");
				count++;
				continue;
			}
			if(inputNum==rndNum) {
				System.out.println("맞추셨습니다!");
				break;
			}
		}
		System.out.printf("%d번만에 맞추셨습니다.",count);
		System.out.println("프로그램을 종료합니다.");
	}
}
