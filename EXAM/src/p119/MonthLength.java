package p119;

import java.util.*;

public class MonthLength {

	public static void main(String[] args) {
		String month;
		int day =0;
		
		System.out.print("�˰���� ���� �Է��ϼ���\n\"���\"�� ���·� �����ּ��� ");
		Scanner monthInput = new Scanner(System.in);
		month = monthInput.nextLine();
		
		switch(month) {
			case "1��":
			case "3��":
			case "5��":
			case "7��":
			case "8��":
			case "10��":
			case "12��":
				day=31;
				System.out.println("���� �� ���� " + day + "�Դϴ�.");
				break;
			case "4��":
			case "6��":
			case "9��":
			case "11��":
				day=30;
				System.out.println("���� �� ���� " + day + "�Դϴ�.");
				break;
			case "2��":
				day=28;
				System.out.println("���� �� ���� " + day + "�Դϴ�.");
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}
		
	}

}
