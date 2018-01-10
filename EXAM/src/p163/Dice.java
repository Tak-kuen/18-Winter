package p163;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice [] = new int[6];
		
		for(int i=0;i<12000;i++) {
			int index=(int)(Math.random()*6);
			dice[index]++;}
			
		for(int i=0;i<dice.length;i++) {
			System.out.printf("%d %d¹ø", i+1, dice[i]);
			System.out.println();
		}
	}
}
