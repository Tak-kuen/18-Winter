package p368;

import javax.swing.*;

public class MyFrame {

	public static void main(String[] args) {
		JFrame my = new JFrame("첫 창");
		JFrame my2 = new JFrame("두번째 창");
		
		my.setSize(480,320);
		my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		my.setVisible(true);
		
		my2.setSize(720,480);
		my2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		my2.setVisible(true);

	}

}
