package p730;

class Producer implements Runnable {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			buffer.put(i);
			System.out.println("������ : " + i + "�� ������ �����߽��ϴ�.");
			try {
				Thread.sleep((int) (Math.random()*100));
			} catch(InterruptedException e) {
			}
		}
	}
}
