package StudentGUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class StudentGUI extends JFrame implements ActionListener{
	/*
	 * 리스너를 프레임 클래스와 같이 쓸수도 있다
	 */
	
	JLabel studNumberLabel;
	JLabel studNameLabel;
	JLabel pointLabel;
	
	JButton studyButton;
	JButton playButton;
	
	JPanel panel;
	
	Student std;
	
	public StudentGUI(Student std) {
		this.std = std;
		studNumberLabel = new JLabel(Integer.toString(std.getStudNumber()));
		studNameLabel = new JLabel(std.getStudName());
		pointLabel = new JLabel(Integer.toString(std.getPoint()));
		
		studyButton = new JButton("공부하기");
		studyButton.addActionListener(this);		//클래스자체가 리스너를 구현하기때문에 this써도 ㄱㅊ
		playButton = new JButton("놀기");
		playButton.addActionListener(this);
		
		panel = new JPanel();
		
		panel.add(studNumberLabel);
		panel.add(studNameLabel);
		panel.add(pointLabel);
		panel.add(studyButton);
		panel.add(playButton);
		
		this.add(panel);
		this.setBounds(100,50,400,200);
		this.setTitle("학생관리시스템 v0.1");
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playButton) {
			std.decreasePoint();
			pointLabel.setText(Integer.toString(std.getPoint()));
		}
		else if(e.getSource()==studyButton) {
			std.increasePoint();
			pointLabel.setText(Integer.toString(std.getPoint()));
		}
		
	}
}
