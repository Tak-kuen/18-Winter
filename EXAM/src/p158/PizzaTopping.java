package p158;

import java.util.*;

public class PizzaTopping {

	public static void main(String[] args) {
		String[] topping = {"Pepperoni","Mushrooms","Onions","Sausage","Bacon"};
		int[] menuCount = new int[5];
		int choiceMenu, selectedMenuCount;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� ��Ḧ �����ϼ���");
			for(int i=0; i<topping.length; i++) {
				System.out.print((i+1));
				System.out.print("." + topping[i] + " ");
			}
		System.out.print("0. ����");
		System.out.println();
		
		choiceMenu = input.nextInt();
		
		if(choiceMenu <=0) break;
		
		System.out.print("������ �������� : ");
		selectedMenuCount = input.nextInt();
		
		menuCount[choiceMenu-1] +=selectedMenuCount;
		}
		
		System.out.println("������ ������ ������ ");
		for(int i=0 ; i<topping.length ; i++) {
			System.out.print(topping[i]);
			System.out.print("������ ");
			System.out.println(menuCount[i] +"��");
		}
		System.out.println("�Դϴ�.");
	}
}
