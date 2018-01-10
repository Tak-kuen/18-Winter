package p218;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 8;
		tv.onOff= true;
		tv.setChannel(11);
		int ch = tv.getChannel();
		tv.print();
		
	}

}
