package p218;

public class DamaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dama myDama = new Dama();
		Dama yourDama = new Dama();
		
		myDama.setHealth(100);
		myDama.setName("1204");
		myDama.setHappy(50);
		
		yourDama.setHealth(90);
		yourDama.setName("stk");
		yourDama.setHappy(70);
		
		System.out.println("�̸� : " + myDama.getName());
		System.out.println("�ູ : " + myDama.getHappy());
		System.out.println("�ǰ� : " + myDama.getHealth());
		
		System.out.println(myDama);
		System.out.println(yourDama);
	}
}