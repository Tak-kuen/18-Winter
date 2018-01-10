package p168;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int [] list = {10,20,30,40,50};
		/*int [] numbers = list;
		
		System.out.println(numbers[0]);
		
		numbers[1]=999;
		
		System.out.println(list[1]);
		*/
		
		int [] numbers = Arrays.copyOf(list,list.length );
		System.out.println(numbers[0]);
		
		numbers[1]=999;
		
		System.out.println(list[1]);
		System.out.println(numbers[1]);
	}
}
