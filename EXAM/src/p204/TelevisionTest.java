package p204;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 8;
		tv.onOff= true;
		
		System.out.printf("TV�� ä���� %d, ������ %d�Դϴ�.", tv.channel,tv.volume);

	}

}
