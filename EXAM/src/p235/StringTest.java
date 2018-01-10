package p235;

import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		s1=new String("hello");
		s2=new String("hello");
		
		
		if(s1.equals(s2)) {
			System.out.println("같은문자열");
		}
		else {
			System.out.println("다른문자열");
		}
	}

}
