package star;

public class StarMain {

	public static void main(String[] args) {
		Terran t = new Terran(10,20,50,"�׶�");
		Zerg z = new Zerg(20,40,100,"����");
		Protoss p = new Protoss(50,30,80,"����");
		
		CommandCenter cc = new CommandCenter();
		
		cc.selectedMenu(t);
		cc.selectedMenu(z);
		cc.selectedMenu(p);

}
}