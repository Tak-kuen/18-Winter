package StarCraft;

public class Tribe {
	private int gas=0;
	private int mineral=0;
	private int food=0;
	
	int getFood() {
		return food;
	}
	void setFood(int food) {
		this.food = food;
	}
	void makeGas() {
		gas+=8;
		System.out.println("가스를 캤습니다.");
	}
	void makeMineral() {
		mineral+=8;
		System.out.println("미네랄을 캤습니다.");
	}
	void warnFood() {
		if(food>10) {
			System.out.println("인구가 너무많습니다");
		}
	}
	void victory() {
		System.out.println("승리하셨습니다.");
	}
	void defeat() {
		System.out.println("패배하셨습니다.");
	}
}
