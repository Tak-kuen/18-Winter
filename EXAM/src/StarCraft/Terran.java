package StarCraft;

public class Terran extends Tribe{
	private int buildingHealth=100;
	
	int getBuildingHealth() {
		return buildingHealth;
	}

	void setBuildingHealth(int buildingHealth) {
		this.buildingHealth = buildingHealth;
	}

	void repair() {
		if(buildingHealth <100)
			System.out.println(".........");
			System.out.println(".......");
			System.out.println(".........");
			System.out.println("�����Ͽ����ϴ�.");
			buildingHealth=100;
	}
	
	void lift() {
		System.out.println("�ǹ��� ������ϴ�.");
	}
	
	void warnFood() {
		System.out.println("���ް� �� ��������");
	}
}
