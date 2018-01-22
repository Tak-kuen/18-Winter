package p711;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountDownTest  extends JFrame{
	private JLabel label;
	private JPanel panel;
	
	class MyThread extends Thread {
		public void run() {
			for (int i=10 ; i>=0 ; i--) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + " ");
			}
		}
	}
	
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		panel.add(label);
		panel.setLocation(100, 0);
		this.add(panel);
		(new MyThread()).start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CountDownTest t = new CountDownTest();
	}
}
