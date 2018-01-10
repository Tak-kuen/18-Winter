package p477;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel;
	private JLabel label;
	
	MyListener listener = new MyListener();
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		
		button2 = new JButton("분홍색");
		button2.addActionListener(listener);
		panel.add(button2);
		
		button3 = new JButton("하늘색");
		button3.addActionListener(listener);
		panel.add(button3);
		
		label = new JLabel("기본 화면색입니다.");
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1) {
				panel.setBackground(Color.YELLOW);
				label.setText("노란색 바탕화면입니다.");
			}
			else if (e.getSource()==button2) {
				panel.setBackground(Color.PINK);
				label.setText("분홍색 바탕화면입니다.");
			}
			else if (e.getSource()==button3) {
				panel.setBackground(Color.CYAN);
				label.setText("하늘색 바탕화면입니다.");
			}
		}
	}
}

public class ChangeBackground {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
