package StarCraft;

public class Zerg extends Tribe{
	private int health=100;
	
	int getHealth() {
		return health;
	}

	void setHealth(int health) {
		this.health = health;
	}

	void regenerate(int sec) {
		if(health<100) {
			System.out.println("ü���� ����˴ϴ�.");
			health+=sec*1;
		}
	}
	
	void warnFood() {
		System.out.println("�뱺�ָ� �� �����ϼ���");
	}
	
	void full() {
		if(health==100) {
			System.out.println("ü���� Ǯ�Դϴ�.");
		}
	}
}
