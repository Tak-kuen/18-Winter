package p576;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame implements ActionListener{
	JLabel label;
	
	public ComboBoxFrame() {
		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		
		String[] rival = {"intel","amd","geForce","ryzen"};
		JComboBox rivalList = new JComboBox(rival);
		rivalList.setSelectedIndex(0);
		rivalList.addActionListener(this);
		
		label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(rival[rivalList.getSelectedIndex()]);
		add(rivalList, BorderLayout.PAGE_START);
		add(label, BorderLayout.PAGE_END);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String name = (String) cb.getSelectedItem();
		changePicture(name);
	}
	
	protected void changePicture(String name) {
		ImageIcon icon = new ImageIcon("c:\\" + name + ".gif");
		label.setIcon(icon);
		if(icon!=null) {
			label.setText(null);
		} else
			label.setText("이미지가 발견되지 않았습니다.");
	}
	
	public static void main(String[] args) {
		ComboBoxFrame frame = new ComboBoxFrame();
	}
}
