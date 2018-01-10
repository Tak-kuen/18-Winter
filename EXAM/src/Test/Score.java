package Test;

import java.util.*;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] score = new int[2][3];
		int sub;
		int sum1=0;
		int sum2=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++){
				System.out.print("Á¡¼ö : ");
				sub=scan.nextInt();
			if(i==0) {
				sum1+=score[i][j];
				}
			else {
				sum1+=score[i][j];
				}
			}
			
		}
		System.out.println(sum1/3);
		System.out.println(sum2/3);
	}
}


