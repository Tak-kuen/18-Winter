package p171;

import java.util.*;

import java.lang.reflect.Array;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		String[] name= {"�ȳ�","�氩", "�߰�"};
		/* int[] numbers=new int[SIZE];
		
		for(int i=0 ; i<SIZE ; i++) {
			int r=(int)(Math.random()*100);
			numbers[i]=r;
		} int�� �Ϸ��� �ؿ� �� ���� int�� �ϰ� �迭�̸��� �ٲ�����
		*/
		
		System.out.print("������ ����Ʈ : ");
		for(String r: name)
			System.out.print(r + " ");
		
		Arrays.sort(name);
		
		System.out.print("\n���ĵ� ����Ʈ : ");
		for(String r:name)
			System.out.print(r + " ");
		
		Arrays.sort(name, Collections.reverseOrder());
		System.out.print("\n���ĵ� ����Ʈ : ");
		for(String r:name)
			System.out.print(r + " ");
	}

}
