package p193;

public class InheritanceTest {
	
	public static void main(String[] args) {

		S mys = new S();
		mys.makeGas();
		mys.makeMineral();
		mys.play();
		
		Zerg myz = new Zerg();
		myz.makeGas();
		myz.makeMineral();
		myz.play();
	}
}
