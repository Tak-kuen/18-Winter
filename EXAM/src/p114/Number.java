package p114;

import java.util.*;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("�����Է��ϼ��� ");
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		
		switch(num)
		{
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
	}

}
