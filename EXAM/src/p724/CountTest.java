package p724;

	/**
	 * �������� �����带 ���ÿ� �������Ҷ� ����� �ִ� ������ �ذ��ϴ� ���
	 * ->> ����ȭ ��Ű��
	 *		: �ϳ��� �����尡 critical section�� �����Ҷ� �ٸ� �������
	 *		  �۾��� ���������� ����ߴٰ� ����ȴ�.
	 */
class Counter {
	private int value = 0;
	/* ����ȭ �� ������ ���� ������
	public void increasement() {	value++;	}
	public void decreasement() {	value--;	}
	public void printCounter() {	System.out.println(value);	}
	*/
	//���� ȭ �� ���������� �۵��ϴ� ������
	public synchronized void increasement() {	value++;	}
	public synchronized void decreasement() {	value--;	}
	public synchronized void printCounter() {	System.out.println(value);	}
}

class MyThread extends Thread {
	Counter sharedCounter;
	
	public MyThread(Counter c) {
		this.sharedCounter = c;
	}
	
	public void run() {
		int i = 0;
		while( i < 20000) {
			sharedCounter.increasement();
			sharedCounter.decreasement();
			if(i%40 == 0) {
				sharedCounter.printCounter();
			}
			try {
				sleep((int) (Math.random()*2));
			} catch(InterruptedException e) {	}
			i++;
		}
	}
}

public class CountTest {
	public static void main(String[] args) {
		Counter c = new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		
	}

}
