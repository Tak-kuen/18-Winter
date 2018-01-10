package star;

import java.util.Scanner;

public class CommandCenter {

	private void printMenu() {
	System.out.println("===================");
	System.out.println("1.�ϲ� ����ä��");
	System.out.println("2.�ϲ� �̳׶�ä��");
	System.out.println("3.�ϲ� ����");
	System.out.println("0.����");
	System.out.println("===================");
	}
	
	public void selectedMenu(Tribe worker) {

		Scanner scan = new Scanner(System.in);
		int choicedNumber;
		while(true) {
			printMenu();
			choicedNumber = scan.nextInt();

			if(choicedNumber <= 0) break;

				switch( choicedNumber ) {
		
				case 1: worker.increaseGas();
				System.out.println(worker);
				break;
			
				case 2: worker.increaseMineral();
				System.out.println(worker);
				break;
			
				case 3: worker.attack();
				break;
				
				default: break;
				} // end of switch
		} // end of while
	} // end of selectedMenu Method
} // end of CommandCenter Class


