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
			System.out.print("�����Ͻ� �¼���ȣ�� �Է��ϼ���(-1�� ����)");
			Scanner scan=new Scanner(System.in);
			int s=scan.nextInt();
		
			if(s== -1)
				break;
		
			if(seat[s-1]==0) {
				seat[s-1]=1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}
	}
}
