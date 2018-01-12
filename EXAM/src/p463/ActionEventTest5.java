package p463;

import javax.swing.*;
/**
 * 5. 람다식을 이용하는 방법
 * - 일단을 모르겠지만 무명보단 훨씬 간단
 * - 이벤트 클래스를 임포트하지않아도 된다
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
		button.addActionListener(e -> {
					label.setText("마침내 버튼이 눌러졌습니다.");
		});
		
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		}
}
public class ActionEventTest5 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}

