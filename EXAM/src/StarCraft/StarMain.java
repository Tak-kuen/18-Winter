package StarCraft;

public class StarMain {

	public static void main(String[] args) {
		Terran t01 = new Terran();
		Protoss p01 = new Protoss();
		Zerg z01 = new Zerg();
		
		t01.makeGas();
		t01.makeMineral();
		t01.setFood(15);
		t01.warnFood();
		t01.victory();
		t01.defeat();
		t01.setBuildingHealth(90);
		t01.repair();
		t01.lift();
		System.out.println("--------------------");
		
		p01.makeGas();
		p01.makeMineral();
		p01.setFood(15);
		p01.warnFood();
		p01.victory();
		p01.defeat();
		p01.setSheild(90);
		p01.regenerate(10);
		p01.light();
		System.out.println("--------------------");
		z01.makeGas();
		z01.makeMineral();
		z01.setFood(15);
		z01.warnFood();
		z01.victory();
		z01.defeat();
		z01.setHealth(90);
		z01.regenerate(10);
		z01.full();
	}

}
