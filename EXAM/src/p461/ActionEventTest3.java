package p461;

import java.awt.event.*;
import javax.swing.*;
/**
 * 3. MyFrame 클래스가 이벤트를 처리(프레임자체가 상속과 구현을 다함)
 * - 프레임객체에 이벤트 추가할때 this 만적어도 됨
 * - 이벤트 클래스를 따로 만들필요 없다.
 */

class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제 첫번째");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		}
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() ==button) {
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}
}

public class ActionEventTest3 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}