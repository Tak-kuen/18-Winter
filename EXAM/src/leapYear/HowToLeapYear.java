package leapYear;

public class HowToLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2017 ;
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("������ �ƴմϴ�.");
		}
	}

}
