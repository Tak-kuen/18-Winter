package p198;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 8;
		myTv.onOff= true;
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 6;
		yourTv.onOff= true;
		
		System.out.printf("���� TV�� ä���� %d, ������ %d�Դϴ�.", myTv.channel,myTv.volume);
		System.out.printf("\n���� TV�� ä���� %d, ������ %d�Դϴ�.", yourTv.channel,yourTv.volume);

	}

}
