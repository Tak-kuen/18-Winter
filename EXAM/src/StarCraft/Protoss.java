package StarCraft;

public class Protoss extends Tribe{
	private int sheild=100;
	
	int getSheild() {
		return sheild;
	}
	void setSheild(int sheild) {
		this.sheild = sheild;
	}
	void regenerate(int hour) {
		if(sheild<100) {
			System.out.println("���� �����");
			sheild+=hour*1;
		}
	}
	void light() {
		if(sheild==100) {
			System.out.println("���� �� ä����");
		}
	}
	void warnFood() {
		System.out.println("����ž�� �� ��������");
	}
}
