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
		str="�̸� " + name + ", �ູ���� " + String.valueOf(happy) +
		", �ǰ����� " + String.valueOf(health);
		return str;
	}
}
