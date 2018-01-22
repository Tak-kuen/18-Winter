package p715;

import javax.swing.*;

public class IntelNo1 extends JFrame {
	
	class MyThread extends Thread {
		private JLabel label;
		private int x, y;
		
		public MyThread (String fname, int x, int y) {
			this.x=x;
			this.y=y;
			label = new JLabel();
			label.setIcon(new ImageIcon(fname));
			label.setBounds(x,y,100,100);
			add(label);
		}
		
		public void run() {
			for( int i=80 ; i>=0 ; i--) {
				x+= 10*Math.random();
				label.setBounds(x,y,100,100);
				repaint();
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
		
	public IntelNo1() {
			setTitle("IntelNo1");
			setSize(600,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			
			(new MyThread("D:\\img\\gtx.gif",100,0)).start();
			(new MyThread("D:\\img\\amd.gif",100,100)).start();
			(new MyThread("D:\\img\\ryzen.gif",100,200)).start();
			setVisible(true);
	}
	public static void main(String[] args) {
		IntelNo1 t = new IntelNo1();
	}
	
}
