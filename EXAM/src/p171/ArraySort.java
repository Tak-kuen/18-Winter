package p171;

import java.util.*;

import java.lang.reflect.Array;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		String[] name= {"안녕","방갑", "잘가"};
		/* int[] numbers=new int[SIZE];
		
		for(int i=0 ; i<SIZE ; i++) {
			int r=(int)(Math.random()*100);
			numbers[i]=r;
		} int로 하려면 밑에 다 변수 int로 하고 배열이름도 바꿔주자
		*/
		
		System.out.print("최초의 리스트 : ");
		for(String r: name)
			System.out.print(r + " ");
		
		Arrays.sort(name);
		
		System.out.print("\n정렬된 리스트 : ");
		for(String r:name)
			System.out.print(r + " ");
		
		Arrays.sort(name, Collections.reverseOrder());
		System.out.print("\n정렬된 리스트 : ");
		for(String r:name)
			System.out.print(r + " ");
	}

}
