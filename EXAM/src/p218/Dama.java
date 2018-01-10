package p218;

public class Dama {

	private int health;
	private String name;
	private double happy;
	
	public void setHealth(int health) {
		this.health=health;
	}
	public int getHealth() {
		return health;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setHappy(double happy) {
		this.happy=happy;
	}
	public double getHappy() {
		return happy;
	}
	
	public String toString() {
		String str;
		str="이름 " + name + ", 행복지수 " + String.valueOf(happy) +
		", 건강지수 " + String.valueOf(health);
		return str;
	}
}
