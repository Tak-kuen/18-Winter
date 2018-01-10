package star;

public class Protoss extends Tribe{
	
	public Protoss(int mineral, int gas, int life, String name) {
		super(mineral, gas, life, name);
	}
	
	public void attack() {
		System.out.println("나는 플토...");
		System.out.println("전기 공격...");
	}
}
