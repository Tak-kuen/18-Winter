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
			System.out.println("쉴드 재생중");
			sheild+=hour*1;
		}
	}
	void light() {
		if(sheild==100) {
			System.out.println("쉴드 다 채워짐");
		}
	}
	void warnFood() {
		System.out.println("수정탑을 더 지으세요");
	}
}
