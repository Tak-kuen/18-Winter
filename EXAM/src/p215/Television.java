package p215;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.printf("나의 TV의 채널은 %d, 볼륨은 %d입니다.", channel,volume);
	}
	
	int getChannel() {
		return channel;
	}

}
