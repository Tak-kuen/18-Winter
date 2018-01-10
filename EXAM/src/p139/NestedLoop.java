package p139;

import java.util.*;

public class NestedLoop {

	public static void main(String[] args) {
		Random rndCount = new Random();
		int num;
		for(int i = 0 ; i < 20 ; i++) {
			for(int j = 0 ; j < 50 ; j++) {
				/*
				if(i == rndCount.nextInt(50))
					System.out.print("*");
				else
					System.out.print(" ");
				*/
				num = rndCount.nextInt(2);
				if(num == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
