package p164;

import java.util.*;

public class TheaterReserve {
	
	public static void main(String[] args) {
	
		int seat [] = {0,0,0,0,0,0,0,0,0,0};
		
		while(true) {
			System.out.println("=============================");
			for(int i=0;i<seat.length;i++) {
				System.out.print((i+1) + "  ");
			}
			
			System.out.println();
		
			for(int i=0;i<seat.length;i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("=============================");
			System.out.print("예약하실 좌석번호를 입력하세요(-1은 종료)");
			Scanner scan=new Scanner(System.in);
			int s=scan.nextInt();
		
			if(s== -1)
				break;
		
			if(seat[s-1]==0) {
				seat[s-1]=1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
	}
}
