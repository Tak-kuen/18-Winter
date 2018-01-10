package p194;

public class TribeMain {

	public static void main(String[] args) {
		
		Tribe myTribe;
		
		myTribe = new Terran();
		myTribe.attack();
		myTribe.makeGas();
		
		myTribe = new Zerg();
		myTribe.attack();
		
		myTribe = new Protoss();
		myTribe.attack();
	}

}
