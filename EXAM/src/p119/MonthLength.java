package p119;

import java.util.*;

public class MonthLength {

	public static void main(String[] args) {
		String month;
		int day =0;
		
		System.out.print("알고싶은 달을 입력하세요\n\"몇월\"의 형태로 적어주세요 ");
		Scanner monthInput = new Scanner(System.in);
		month = monthInput.nextLine();
		
		switch(month) {
			case "1월":
			case "3월":
			case "5월":
			case "7월":
			case "8월":
			case "10월":
			case "12월":
				day=31;
				System.out.println("월의 날 수는 " + day + "입니다.");
				break;
			case "4월":
			case "6월":
			case "9월":
			case "11월":
				day=30;
				System.out.println("월의 날 수는 " + day + "입니다.");
				break;
			case "2월":
				day=28;
				System.out.println("월의 날 수는 " + day + "입니다.");
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
		
	}

}
