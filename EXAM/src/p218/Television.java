package p218;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.printf("���� TV�� ä���� %d, ������ %d�Դϴ�.", channel,volume);
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}

}