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
		System.out.println("������ ĺ���ϴ�.");
	}
	void makeMineral() {
		mineral+=8;
		System.out.println("�̳׶��� ĺ���ϴ�.");
	}
	void warnFood() {
		if(food>10) {
			System.out.println("�α��� �ʹ������ϴ�");
		}
	}
	void victory() {
		System.out.println("�¸��ϼ̽��ϴ�.");
	}
	void defeat() {
		System.out.println("�й��ϼ̽��ϴ�.");
	}
}
