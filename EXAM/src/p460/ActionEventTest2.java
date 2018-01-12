package p460;

import javax.swing.*;
import java.awt.event.*;

/**
 * 2. 리스너 클래슬르 내부 클래스로 작성
 *  - 프레임안의 객체에 접근할수 있다.
 * 
 *
 */
class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제 첫번째");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() ==button) {
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}
	}
}

public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}


