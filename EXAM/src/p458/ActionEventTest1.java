package p458;

/**
 * 1. �����ʸ� �������� Ŭ������ �ۼ��ϴ¹��
 */
import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String msg = (String) e.getSource();
		JButton button = (JButton) e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
		//label.setText("��ħ�� ��ư�� ���������ϴ�.");
	}
}

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ���� ù��°");
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}

public class ActionEventTest1 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
	
}
