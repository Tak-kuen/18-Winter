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
		
		System.out.printf("나의 TV의 채널은 %d, 볼륨은 %d입니다.", myTv.channel,myTv.volume);
		System.out.printf("\n너의 TV의 채널은 %d, 볼륨은 %d입니다.", yourTv.channel,yourTv.volume);

	}

}
