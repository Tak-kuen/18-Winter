package leapYear;

public class HowToLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2017 ;
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ");
		}
		else {
			System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
		}
	}

}
