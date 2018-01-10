package star;

public class Tribe {
	private int mineral;
	private int gas;
	private int life;
	private String name;
	private int id;
	private static int count=0;
	
	public Tribe() {
		this(50,30,100,"¹«¸í¾¾");
	}
	public Tribe(int mineral, int gas, int life) {
		this (mineral, gas, life, "¹«¸í¾¾");
	}
	
	public Tribe(int mineral, int gas, int life, String name) {
		this.id = ++count;
		this.mineral = mineral;
		this.gas = gas;
		this.life = life;
	}
	
	public String toString() {
		String str;
		str = "°´Ã¼ÀÌ¸§ : " + this.name;
		str += "\n°´Ã¼ID : " + this.id;
		str += "\n¹Ì³×¶ö¼öÄ¡ : " + this.mineral;
		str += "\n°¡½º¼öÄ¡ : " + this.gas;
		str += "\n»ı¸í¼öÄ¡ : "  + this.life;
		
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
