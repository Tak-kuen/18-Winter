package Game;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;

public class HighScore extends JFrame{
	JFrame HighScore = new JFrame();
	JPanel score;
	JLabel scorenum;
	
	HighScore() {
		score = new JPanel();
		scorenum = new JLabel("");
		scorenum.setFont(new Font("Malgun Gothic", Font.BOLD, 50));
		score.add(scorenum);
		
		this.add(score);
		this.setTitle("HighScore");
		this.setSize(400,100);
		this.setVisible(true);
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) (screen.getWidth() / 2 - getWidth() / 2);
		int y = (int) (screen.getHeight() / 2 - getHeight() / 2);
		setLocation(x, y);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				HighScore.setVisible(false);
				HighScore.dispose();
			}
		});
	
	}
}
