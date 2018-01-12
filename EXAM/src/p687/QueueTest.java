package p687;

import java.util.*;

public class QueueTest {
	public static void main(String[] args) throws InterruptedException {
		//쓰레드의 sleep가 오류를 발생시킬수있기때문에 throws나 thread에 트라이캐치써줘야 한다.
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i= time ; i>=0 ; i--) {
			queue.add(i);
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.remove()+ " ");
			Thread.sleep(1000);
		}
	}
}
