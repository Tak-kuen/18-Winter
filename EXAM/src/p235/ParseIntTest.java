package p235;

import java.util.*;

public class ParseIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selNum;
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		str=scan.next();
		
		selNum=Integer.parseInt(str);
		
		System.out.println("�Է��� ������ " + selNum);

	}

}
