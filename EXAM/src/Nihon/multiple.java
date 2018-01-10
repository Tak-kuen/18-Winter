package Nihon;

public class multiple {

	public static void main(String[] args) {
		/*
		 * int num;
		 
		
		for(num=1;num<=100;num++) {
			if((num%3==0)&&(num%5==0)) {
				System.out.println(num + " 3의 배수이면서 5의배수");
			}
			else if((num%3==0)&&(num%5!=0)) {
				System.out.println(num + " 3의 배수");
			}
			else if((num%3!=0)&&(num%5==0)) {
				System.out.println(num + " 5의 배수");
			}
			else {
				System.out.println(num);
			}
		} */
		int num;
		
		for(num=1;num<=100;num++) {
			if((num%3==0)&&(num%5!=0)) {
				System.out.println(num + " | 3의 배수");
			}
			else if((num%3!=0)&&(num%5==0)) {
				System.out.println(num + " | 5의 배수");
			}
			else if((num%3==0)&&(num%5==0)) {
				System.out.println(num + " | 3의배수이면서 5의 배수");
			}
			else {
				System.out.println(num);
			}
		}
	}

}
