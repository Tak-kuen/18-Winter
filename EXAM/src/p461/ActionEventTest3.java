package p461;

import java.awt.event.*;
import javax.swing.*;
/**
 * 3. MyFrame Ŭ������ �̺�Ʈ�� ó��(��������ü�� ��Ӱ� ������ ����)
 * - �����Ӱ�ü�� �̺�Ʈ �߰��Ҷ� this ����� ��
 * - �̺�Ʈ Ŭ������ ���� �����ʿ� ����.
 */

class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ���� ù��°");
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		}
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() ==button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
}

public class ActionEventTest3 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}