package p730;

class Consumer implements Runnable {
	private Buffer buffer;
	
	public Consumer(Buffer drop) {
		this.buffer = drop;
	}
	
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			int data = buffer.get();
			System.out.println("�Һ��� : " + i + "�� ������ �Һ��߽��ϴ�.");
			try {
				Thread.sleep((int) (Math.random()*100));
			} catch(InterruptedException e) {
			}
		}
	}
}
