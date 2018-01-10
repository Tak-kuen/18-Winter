package p158;

import java.util.*;

public class PizzaTopping {

	public static void main(String[] args) {
		String[] topping = {"Pepperoni","Mushrooms","Onions","Sausage","Bacon"};
		int[] menuCount = new int[5];
		int choiceMenu, selectedMenuCount;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("토핑 재료를 선택하세요");
			for(int i=0; i<topping.length; i++) {
				System.out.print((i+1));
				System.out.print("." + topping[i] + " ");
			}
		System.out.print("0. 종료");
		System.out.println();
		
		choiceMenu = input.nextInt();
		
		if(choiceMenu <=0) break;
		
		System.out.print("수량을 적으세요 : ");
		selectedMenuCount = input.nextInt();
		
		menuCount[choiceMenu-1] +=selectedMenuCount;
		}
		
		System.out.println("고객님이 선택한 토핑은 ");
		for(int i=0 ; i<topping.length ; i++) {
			System.out.print(topping[i]);
			System.out.print("토핑은 ");
			System.out.println(menuCount[i] +"개");
		}
		System.out.println("입니다.");
	}
}
