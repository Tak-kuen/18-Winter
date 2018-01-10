package p235;

import java.util.*;

public class ParseIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selNum;
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		str=scan.next();
		
		selNum=Integer.parseInt(str);
		
		System.out.println("입력한 정수는 " + selNum);

	}

}
