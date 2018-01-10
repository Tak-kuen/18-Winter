package p161;

import java.util.*;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int whatNum;
		int count=0;
		int num [] = {10,50,80,30,90,60,40,20,50,90};
		
		System.out.print("찾을 숫자를 입력하세요(10~90) ");
		whatNum=input.nextInt();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==whatNum) {
				System.out.printf("입력한 %d 값은 %d번째에 있습니다",whatNum,i+1);
				System.out.println();
				count++;
			}
		}
		if(count==0) {
			System.out.println("찾는 값이 없습니다.");
		}
	}
}
