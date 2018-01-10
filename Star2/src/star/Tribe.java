package star;

public class Tribe {
	private int mineral;
	private int gas;
	private int life;
	private String name;
	private int id;
	private static int count=0;
	
	public Tribe() {
		this(50,30,100,"����");
	}
	public Tribe(int mineral, int gas, int life) {
		this (mineral, gas, life, "����");
	}
	
	public Tribe(int mineral, int gas, int life, String name) {
		this.id = ++count;
		this.mineral = mineral;
		this.gas = gas;
		this.life = life;
	}
	
	public String toString() {
		String str;
		str = "��ü�̸� : " + this.name;
		str += "\n��üID : " + this.id;
		str += "\n�̳׶���ġ : " + this.mineral;
		str += "\n������ġ : " + this.gas;
		str += "\n�����ġ : "  + this.life;
		
		return str;
	}
	
	public void increaseMineral() {
		this.mineral +=8;
	}
	
	public void increaseGas() {
		this.gas +=4;
	}
	
	public void attack() {
		
	}
}
