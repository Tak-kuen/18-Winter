package Nihon;

public class multiple {

	public static void main(String[] args) {
		/*
		 * int num;
		 
		
		for(num=1;num<=100;num++) {
			if((num%3==0)&&(num%5==0)) {
				System.out.println(num + " 3�� ����̸鼭 5�ǹ��");
			}
			else if((num%3==0)&&(num%5!=0)) {
				System.out.println(num + " 3�� ���");
			}
			else if((num%3!=0)&&(num%5==0)) {
				System.out.println(num + " 5�� ���");
			}
			else {
				System.out.println(num);
			}
		} */
		int num;
		
		for(num=1;num<=100;num++) {
			if((num%3==0)&&(num%5!=0)) {
				System.out.println(num + " | 3�� ���");
			}
			else if((num%3!=0)&&(num%5==0)) {
				System.out.println(num + " | 5�� ���");
			}
			else if((num%3==0)&&(num%5==0)) {
				System.out.println(num + " | 3�ǹ���̸鼭 5�� ���");
			}
			else {
				System.out.println(num);
			}
		}
	}

}
