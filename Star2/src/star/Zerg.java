package star;

public class Zerg extends Tribe{
	
	public Zerg(int mineral, int gas, int life, String name) {
		super(mineral, gas, life, name);
	}

	public void attack() {
		System.out.println("나는 저그...");
		System.out.println("침을 뱉지...");
	}
}
