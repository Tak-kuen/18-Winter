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
			System.out.println("수리하였습니다.");
			buildingHealth=100;
	}
	
	void lift() {
		System.out.println("건물을 띄웠습니다.");
	}
	
	void warnFood() {
		System.out.println("보급고를 더 지으세요");
	}
}
