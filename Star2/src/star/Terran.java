package star;

public class Terran extends Tribe{
	public Terran(int mineral, int gas, int life, String name) {
		super(mineral, gas, life, name);
	}
	
	public void attack() {
		System.out.println("���� �׶�...");
		System.out.println("���� ���...");
	}
}
