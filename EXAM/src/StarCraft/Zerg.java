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
			System.out.println("체력이 재생됩니다.");
			health+=sec*1;
		}
	}
	
	void warnFood() {
		System.out.println("대군주를 더 생성하세요");
	}
	
	void full() {
		if(health==100) {
			System.out.println("체력이 풀입니다.");
		}
	}
}
