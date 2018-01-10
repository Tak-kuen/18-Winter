package p204;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 8;
		tv.onOff= true;
		
		System.out.printf("TV의 채널은 %d, 볼륨은 %d입니다.", tv.channel,tv.volume);

	}

}
