package p724;

	/**
	 * 여러개의 스레드를 동시에 돌려야할때 생길수 있는 문제를 해결하는 방법
	 * ->> 동기화 시키기
	 *		: 하나의 스레드가 critical section을 관여할때 다른 스레드는
	 *		  작업이 끝날때까지 대기했다가 실행된다.
	 */
class Counter {
	private int value = 0;
	/* 동기화 전 오류가 나는 스레드
	public void increasement() {	value++;	}
	public void decreasement() {	value--;	}
	public void printCounter() {	System.out.println(value);	}
	*/
	//동기 화 후 정상적으로 작동하는 스레드
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
